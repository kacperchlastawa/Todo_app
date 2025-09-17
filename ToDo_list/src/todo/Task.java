public class Task{


    private  final int id;
    private  String description;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
    }
    @Override
    public String toString() {
        return "Task ID: " + id + ", Description: " + description;
    }
    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    // public void setId(int id){
    //     this.id = id;
    // }

}