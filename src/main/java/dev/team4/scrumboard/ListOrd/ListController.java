package dev.team4.scrumboard.ListOrd;

import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/api/list")
public class ListController {

    private final ListRepository repository;
  
    public ListController(ListRepository repository) {
        this.repository = repository;
    }

    @PostMapping
public TList createList(@RequestBody TList list) {

    System.out.println("Empfangene Task: " + list.getTitel());
    TList savedList = repository.save(list);
    System.out.println("Gespeichert mit ID: " + savedList.getListId());
    return savedList;
}

}