package dev.team4.scrumboard.UserStoryOrd;
import org.springframework.web.bind.annotation.*;
import dev.team4.scrumboard.ListOrd.ListRepository;

@RestController
@RequestMapping("/api/stories")
public class UserStoryController {

    private final UserStoryRepository repository;
    private final ListRepository listRepository;

    public UserStoryController(UserStoryRepository repository, ListRepository listRepository) {
        this.repository = repository;
        this.listRepository =listRepository;
    }

    @PostMapping
public UserStory createStory(@RequestBody UserStory story) {
    Long listId = story.getListId();
    if(listId == null){
        System.out.println("ListId nicht vorhanden");
        return null;
    }
    boolean listExist = listRepository.existsById(listId);
    if(!listExist){
        System.out.println("Liste existiert nicht");
        return null;
    }
    System.out.println("Empfangene Story: " + story.getTitel() + ", " + story.getBeschreibung());
    UserStory savedStory = repository.save(story);
    
    System.out.println("Gespeichert mit ID: " + savedStory.getStoryId());
    return savedStory;
}
}