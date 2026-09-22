import java.time.LocalDateTime;

public class Task {
	private enum Status {
		TODO, IN_PROGRESS, DONE
	}
	
	private int id;
	private String description;
	private Status status;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private TaskManager manager;
	
	public Task(String description) {
		id = manager.getSize();
		this.description = description;
		status = Status.TODO;
		createdAt = LocalDateTime.now();
		updatedAt = null;
	}
	
	public int getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	
}
