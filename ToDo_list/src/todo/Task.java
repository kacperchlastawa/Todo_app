public class Task{


    public int id;
    public String description;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public String toString() {
        return "Task ID: " + id + ", Description: " + description;
    }

}