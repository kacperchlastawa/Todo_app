
import java.util.ArrayList;

public class TaskManager{
        private int nextId = 1;
        private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String description) {
      
        Task newTask = new Task(nextId++, description);
        tasks.add(newTask);
    }
    
    public void removeTask(int taskId) {
        int sizeBefore = tasks.size();
        tasks.removeIf(task -> task.getId() == taskId);
        int sizeAfter = tasks.size();
        String ifnotremoved = (sizeBefore == sizeAfter) ?
        "Task with ID " + taskId + " not removed. There was a problem" : "Task with ID " + taskId + " removed successfully.";
        System.out.println(ifnotremoved);
    }   
    public void listTasks() {
        if(tasks.isEmpty()){
            System.out.println("No tasks available.");
        }
        for(Task task : tasks){
            System.out.println(task);
        }
    }
    public void saveToFile(String filename) {
        // Implementation for saving tasks to a file
    }
    public void loadFromFile(String filename) {
        // Implementation for loading tasks from a file
    }
}
