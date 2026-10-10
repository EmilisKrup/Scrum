package dev.team4.scrumboard.ListOrd;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long listId;
    private String titel;
    public TList() {}

    public String getTitel() { return titel; }
    public void setTitel(String titel) { this.titel = titel; }
    public Long getListId() { return listId; }
    public void setListId(Long listId) { this.listId = listId; }
}