package dev.team4.scrumboard.TasksOrd;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titel;
    private String beschreibung;
    private int status;
    private Long storyId;
    
    private Long listId;

    public Tasks() {}

    public Long getStoryId() { return storyId; }
    public void setStoryId(Long storyId){ this.storyId =storyId; }
    public Long getId() { return id; }
    public String getTitel() { return titel; }
    public void setTitel(String titel) { this.titel = titel; }
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String beschreibung) { this.beschreibung = beschreibung; }
    public int getStatus() { return status; }
    public void setStatus(int status) { this.status = status; }
    public Long getListId() { return listId; }
    public void setListId(Long listId) { this.listId = listId; }
}

