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
}
