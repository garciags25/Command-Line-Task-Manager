import java.util.ArrayList;

public class TaskManager {
	private ArrayList<Task> taskList = new ArrayList<>();
	
	public ArrayList<Task> getTaskList() {
		return taskList;
	}
	
	public int getSize() {
		return taskList.size();
	}
	
	public void add(String description) {
		Task task = new Task(description);
		taskList.add(task);
	}
	
	public void update(int id, String description) {
		Task updateTask = taskList.get(id - 1);
		updateTask.setDescription(description);
		updateTask.setUpdatedAt();
	}
	
	public void delete(int id) {
		taskList.remove(taskList.get(id - 1));
	}
	
}
