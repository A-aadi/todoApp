package adarsh.todo.main.model;

import com.google.gson.annotations.SerializedName;


public class Todo {

    @SerializedName("Description")
    private String description;

    public String getPriority() {
        return priority;
    }

    public String getFinished() {
        return finished;
    }

    @SerializedName("Priority")
    private String priority;

    @SerializedName("Finished")
    private String finished;

    public Todo(String description, String priority, String finished) {
        this.description = description;
        this.priority = priority;
        this.finished = finished;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "description='" + description + '\'' +
                ", priority='" + priority + '\'' +
                ", finished='" + finished + '\'' +
                '}';
    }
}