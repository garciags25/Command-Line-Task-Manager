import java.util.ArrayList;

public class TaskManager {
	private ArrayList<Task> taskList = new ArrayList<>();
	
	public ArrayList<Task> getTaskList() {
		return taskList;
	}
	
	public int getSize() {
		return taskList.size();
	}
	
}
