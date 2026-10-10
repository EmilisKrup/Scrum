package dev.team4.scrumboard.TasksOrd;
import org.springframework.web.bind.annotation.*;
import dev.team4.scrumboard.UserStoryOrd.UserStory;
import dev.team4.scrumboard.UserStoryOrd.UserStoryRepository;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TasksController {

    private final TasksRepository repository;
    private final UserStoryRepository userStoryRepository;
    public TasksController(TasksRepository repository, UserStoryRepository userStoryRepository) {
        this.repository = repository;
        this.userStoryRepository = userStoryRepository;
    }

    
    @PostMapping
    
public Tasks createTasks(@RequestBody Tasks task) {

    Long storyId = task.getStoryId();
    boolean storyIdExists = userStoryRepository.existsById(storyId);
    if(!storyIdExists){
        System.out.println("UserStory existiert nicht");
        return null;
    }
    if (storyId != null){ 
        UserStory story = userStoryRepository.findById(storyId)
        .orElseThrow(()->new RuntimeException("Story nicht gefunden"));
        task.setListId(story.getListId());
    }  
   Tasks savedTask = repository.save(task);
    System.out.println("Gespeichert mit ID: " + savedTask.getId());
    return savedTask;
}
@GetMapping("/liste/{id}")
public List<Tasks> getTasksByList(@PathVariable("id") Long id){
    return repository.findByListId(id);
}

}