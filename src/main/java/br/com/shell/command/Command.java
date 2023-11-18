package br.com.shell.command;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import br.com.shell.model.Task;
import br.com.shell.service.TaskService;

/**
 * 
 * Enilson Filho
 */
@ShellComponent 
public class Command {    

    @Autowired
    private TaskService taskService;

    @ShellMethod(value = "Printa no terminal uma mensagem de apresentacao", key = "hello")
    public String hello() {
        return "Ola, voce esta utilizando Spring Shell!";
    }

    @ShellMethod(value = "Cria uma nova tarefa", key = "add-task")
    public void addTask(String description) {
        taskService.addTask(description);
    }

    @ShellMethod(value = "Lista todas as tarefas", key = "list-task")
    public void listTasks() {
        List<Task> tasks = taskService.getTasks();
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println(i + 1 + ". " + (task.isCompleted() ? "[X]" : "[ ]") + " " + task.getDescription());
        }
    }

    @ShellMethod(value = "Marca uma tarefa como concluida", key = "complete-task")
    public void completeTask(int index) {
        taskService.markTaskAsCompleted(index - 1);
    }

}  