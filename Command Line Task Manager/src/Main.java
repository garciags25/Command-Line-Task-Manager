
public class Main {

	public static void main(String[] args) {
		
		TaskManager manager = new TaskManager();
		manager.add("description 1");
		manager.add("description 2");
		manager.add("description 3");
		
		manager.updateStatus(2, Task.Status.IN_PROGRESS);
		manager.updateStatus(3, Task.Status.DONE);
		
		System.out.println(manager.getTaskList());
		
	}

}
