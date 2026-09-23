
public class Main {

	public static void main(String[] args) {
		
		TaskManager manager = new TaskManager();
		
		if (args.length != 0) {
			switch (args[0].toLowerCase()) {
			case "add": 
				if (args.length != 2) {
					System.out.println("Unsuccessful. The Command 'add' must be followed by and "
							+ "ended with a description");
					break;
				}
				manager.add(args[1]);
				System.out.println("Successfully added task. Task id: " + manager.getSize());
				break;
				
			case "update":
				if (args.length != 3) {
					System.out.println("Unsuccessful. The Command 'update' must follow with task id # "
					+ "and end with a description");
					break;
				}
				if (manager.getSize() == 0) {
					System.out.println("Unsuccessful. Task List is empty.");
					break;
				}
				int taskId;
				try {
					taskId = Integer.parseInt(args[1]);
				} catch (NumberFormatException e) {
					System.out.println("Unsuccessful. The second argument is not a number." + e.getMessage());
					break;
				}

				if (manager.update(taskId, args[2])) {
					System.out.println("Successful. Task " + taskId + " updated.");
				} else {
					System.out.println("Unsuccessful. Task " + taskId + " was not found.");
				}
				break;
				
			case "delete":
				if (manager.getSize() == 0) {
					System.out.println("Unsuccessful. Task List is empty.");
					break;
				}
				if (args.length != 2) {
					System.out.println("Unsuccessful. Delete must be followed by only a task id number.");
					break;
				}
				try {
					taskId = Integer.parseInt(args[1]);
				} catch (NumberFormatException e) {
					System.out.println("Unsuccessful. The second argument is not a number. " + e.getMessage());
					break;
				}
				
				if (manager.delete(taskId)) {
					System.out.println("Successful. Task: " + taskId + " deleted.");
				} else {
					System.out.println("Unsuccessful. Task: " + taskId + " was not found.");
				}
				break;
				
			case "list":
				if (args.length != 1) {
					System.out.println("Unsuccessful. Command 'list' must be the only argument.");
					break;
				}
				if (manager.getSize() == 0) {
					System.out.println("Unsuccessful. Task List is empty.");
					break;
				}
				System.out.println(manager.getTaskList());
				break;
				
			default: System.out.println("Unknown Command. Known Commands: add, update, delete, list");
				break;
			}
		}
	}

}
