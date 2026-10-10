package dev.team4.scrumboard.UserStoryOrd;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserStory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storyId;

    private String titel;
    private String beschreibung;
    private int prioritaet;
    private Long listId;

    public UserStory() {}

    public Long getStoryId() { return storyId; }
    public String getTitel() { return titel; }
    public void setTitel(String titel) { this.titel = titel; }
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String beschreibung) { this.beschreibung = beschreibung; }
    public int getPrioritaet() { return prioritaet; }
    public void setPrioritaet(int prioritaet) { this.prioritaet = prioritaet; }
    public Long getListId() { return listId; }
    public void setListId(Long listId) { this.listId = listId; }
}