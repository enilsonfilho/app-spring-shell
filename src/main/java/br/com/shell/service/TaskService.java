package br.com.shell.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import br.com.shell.model.Task;

/**
 * 
 * Enilson Filho
 */
@Service
public class TaskService {

    private List<Task> tasks = new ArrayList<>();

    public void addTask(String description) {
        Task task = new Task(description);
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
        }
    }
    
}
