public class Task {
    private String description;
    private boolean isComplete;

    public Task(String description) {
        this.description = description;
        this.isComplete = false;
    }

    public void markComplete() {
        isComplete = true;
    }

    public String getDetails() {
        return description + (isComplete ? " [Completed]" : " [Not Completed]");
    }
}
