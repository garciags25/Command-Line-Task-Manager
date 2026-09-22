import java.time.LocalDateTime;

public class Task {
	public enum Status {
		TODO, IN_PROGRESS, DONE
	}
	
	private int id;
	private String description;
	private Status status;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private TaskManager manager;
	
	public Task(String description) {
		id = manager.getSize() + 1;
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
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	
	public void setUpdatedAt() {
		this.updatedAt = LocalDateTime.now();
	}
	
	@Override
	public String toString() {
		return "id: " + id + "\ndescription: " + description + "\nstatus: " + status +
				"\ncreated at: " + createdAt + "\nupdated at: " + updatedAt;
	}
}
