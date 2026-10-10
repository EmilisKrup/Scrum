package dev.team4.scrumboard.TasksOrd;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface TasksRepository extends JpaRepository<Tasks, Long> {
    
List<Tasks> findByListId(Long listId);
}
