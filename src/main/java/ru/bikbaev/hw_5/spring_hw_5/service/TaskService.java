package ru.bikbaev.hw_5.spring_hw_5.service;

import org.springframework.stereotype.Service;
import ru.bikbaev.hw_5.spring_hw_5.data.TaskRepository;
import ru.bikbaev.hw_5.spring_hw_5.model.Task;
import ru.bikbaev.hw_5.spring_hw_5.model.TaskStatus;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task addTask(Task task){
        return taskRepository.save(task);
    }

    public List<Task> allTasks(){
        return taskRepository.getAll();
    }

    public List<Task> getTasksByStatus(TaskStatus taskStatus){
      return   taskRepository.getTasksByStatus(taskStatus);
    }

    public void  updateTaskStatus(long id, String status){

        Task task = taskRepository.findById(id);
        task.setTaskStatus(TaskStatus.statusUpdate(status));
        taskRepository.update(id,task);
    }

    public void deleteTask(long id){
        taskRepository.delete(id);
    }
}
