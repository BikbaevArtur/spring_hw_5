package ru.bikbaev.hw_4.spring_hw_5.data;

import org.springframework.stereotype.Repository;
import ru.bikbaev.hw_4.spring_hw_5.model.Task;
import ru.bikbaev.hw_4.spring_hw_5.model.TaskStatus;

import java.util.List;

@Repository
public class TaskRepository {
    private final TaskJPA taskJPA;

    public TaskRepository(TaskJPA taskJPA) {
        this.taskJPA = taskJPA;
    }


    public Task save(Task task) {
        return taskJPA.save(task);

    }

    public List<Task> getTasksByStatus(TaskStatus taskStatus){
        return taskJPA.getTasksByTaskStatus(taskStatus);
    }

    public List<Task> getAll(){
        return taskJPA.findAll();
    }


    public void delete(long id){
        taskJPA.deleteById(id);
    }


public Task findById(long id){
        return taskJPA.findById(id).orElse(null);
}


public void update( long id, Task task){
  taskJPA.updateTaskById(id,task);
}





}
