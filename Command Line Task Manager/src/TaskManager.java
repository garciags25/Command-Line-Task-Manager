import java.util.ArrayList;


public class TaskManager {
	private ArrayList<Task> taskList = new ArrayList<>();
	private int highestId = 0;
	
	public ArrayList<Task> getTaskList() {
		return taskList;
	}
	
	public int getSize() {
		return taskList.size();
	}
	
	public boolean isEmpty() {
		if (taskList.size() != 0) {
			return false;
		}
		return true;
	}
	
	public int findHighestId() {
		int taskId = 0;
		int foundHighest = 0;
		for (int i = 0; i < taskList.size(); i++) {
			taskId = taskList.get(i).getId();
			
			if (taskId > highestId) {
				foundHighest = taskId;
			}
		}
		return foundHighest;
	}
	
	public Task findTaskById(int id) {
		int taskId = id;
		Task task;
		for (int i = 0; i < taskList.size(); i++) {
			if (taskList.get(i).getId() == taskId) {
				task = taskList.get(i);
				return task;
			}
		}
		return null;
	}
	
	public void add(String description) {
		Task task = new Task(highestId + 1, description);
		taskList.add(task);
		highestId++;
	}
	
	public Boolean update(int id, String description) {
		Task updateTask = findTaskById(id);
		if (updateTask == null) {
			return false;
		}
		updateTask.setDescription(description);
		updateTask.setUpdatedAt();
			return true;
	}
	
	public void updateStatus(int id, Task.Status status) {
		Task updateStatus = taskList.get(id - 1);
		updateStatus.setStatus(status);
		updateStatus.setUpdatedAt();
	}
	
	public boolean delete(int id) {
		Task deleteTask = findTaskById(id);
		if (deleteTask == null) {
			return false;
		}
		taskList.remove(deleteTask);
		highestId = findHighestId();
		
		return true;
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
