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
		Task task = new Task(taskList.size() + 1, description);
		taskList.add(task);
	}
	
	public void update(int id, String description) {
		Task updateTask = taskList.get(id - 1);
		updateTask.setDescription(description);
		updateTask.setUpdatedAt();
	}
	
	public void updateStatus(int id, Task.Status status) {
		Task updateStatus = taskList.get(id - 1);
		updateStatus.setStatus(status);
		updateStatus.setUpdatedAt();
	}
	
	public void delete(int id) {
		taskList.remove(taskList.get(id - 1));
	}
	public void listByStatus(Task.Status status) {
		for (int i = 0; i < taskList.size(); i++) {
			Task curr = taskList.get(i);
			
			if (curr.getStatus() == status) {
				System.out.println(curr);
			} 
		}
	}
	
}
