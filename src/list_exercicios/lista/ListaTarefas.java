package list_exercicios.lista;

import java.util.List;
import java.util.ArrayList;
/**
 * ListaTarefas
 */
public class ListaTarefas  {

    //Atributos
    private List<Tarefa> taskLit;

    //Construtor
    public ListaTarefas() {
        this.taskLit = new ArrayList<>();
    }

    public void addTask(String descricao) {
        var task = new Tarefa(descricao);
        this.taskLit.add(task);
    }

    public void removeTask(String descricao) {
        taskLit.removeIf(task -> task.getDescricao().equals(descricao));
        
    }

    public void showTasks() {
        for (Tarefa tarefa : taskLit) {
            System.out.println(tarefa.getDescricao());
        }
    }

    public void size() {
        System.out.println(taskLit.size());
    }

    
    
}