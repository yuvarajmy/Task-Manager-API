package service;

import model.Task;
import repository.TaskRepository;

import java.util.List;

public class TaskService {
    private TaskRepository taskRepository;

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }
    public Task getTaskById(Long id){
        return null;
    }
    public Task createTask(Task task){
        return null;
    }
    public void deleteTask(Long id){

    }
    public Task updateTask(Long id, Task task){
        return null;
    }

}
