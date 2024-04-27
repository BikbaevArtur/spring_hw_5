package ru.bikbaev.hw_4.spring_hw_5.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import ru.bikbaev.hw_4.spring_hw_5.model.Task;
import ru.bikbaev.hw_4.spring_hw_5.model.TaskStatus;

import java.util.List;

public interface TaskJPA extends JpaRepository<Task, Long> {
    List<Task> getTasksByTaskStatus(TaskStatus taskStatus);

    @Transactional
    @Modifying
    @Query("UPDATE Task t SET t.description = :#{#task.description}, t.taskStatus = :#{#task.taskStatus}, t.localDateTime = :#{#task.localDateTime} WHERE t.id = :id")
    void updateTaskById(long id, Task task);

}

