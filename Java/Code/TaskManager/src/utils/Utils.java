package utils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import com.app.StatusType;
import com.app.Task;

public class Utils {
	private static Map<Integer, Task> taskMap;
	private static Random random;
	private static Scanner scanner = new Scanner(System.in);

	static {
		taskMap = new HashMap<Integer, Task>();
		random = new Random();
	}

	public static void addTask() {
		scanner.nextLine();
		System.out.println("Enter Task Name: ");
		String name = scanner.nextLine();

		System.out.println("Enter task Description: ");
		String description = scanner.nextLine();

		System.out.println("Enter Task Date(yyyy-mm-dd): ");
		LocalDate date = LocalDate.parse(scanner.nextLine());
		int id = checkRandom(random.nextInt(9000) + 1000);
		taskMap.put(id, new Task(id, name, description, date));
	}

	private static int checkRandom(int id) {
		while (taskMap.containsKey(id))
			id = random.nextInt(9000) + 1000;
		return id;
	}


	public static void populateTaskMap() {
		int id;
		taskMap.put(id = checkRandom(1500), new Task(id, "Java Assignments",
				"Complete lab exam prerequisites assignments", LocalDate.parse("2024-04-25")));

		// Add 10 more entries with hardcoded unique data
		taskMap.put(id = checkRandom(1500),
				new Task(id, "Meeting with Client", "Discuss project requirements", LocalDate.parse("2024-05-02")));
		taskMap.put(id = checkRandom(1500), new Task(id, "Prepare Presentation",
				"Create slides for the project presentation", LocalDate.parse("2024-04-25")));
		taskMap.put(id = checkRandom(1500),
				new Task(id, "Review Code", "Review code for quality assurance", LocalDate.parse("2024-05-07")));
		taskMap.put(id = checkRandom(1500), new Task(id, "Project Deployment", "Deploy project to production server",
				LocalDate.parse("2024-05-10")));
		taskMap.put(id = checkRandom(1500),
				new Task(id, "Team Building Activity", "Organize team building event", LocalDate.parse("2024-05-15")));
		taskMap.put(id = checkRandom(1500),
				new Task(id, "Bug Fixing", "Fix bugs reported in the system", LocalDate.parse("2024-05-18")));
		taskMap.put(id = checkRandom(1500), new Task(id, "Training Session",
				"Conduct training session for new employees", LocalDate.parse("2024-05-22")));
		taskMap.put(id = checkRandom(1500),
				new Task(id, "Documentation", "Write documentation for the project", LocalDate.parse("2024-05-25")));
		taskMap.put(id = checkRandom(1500), new Task(id, "Performance Testing",
				"Perform load testing on the application", LocalDate.parse("2024-05-28")));
		taskMap.put(id = checkRandom(1500), new Task(id, "Project Review", "Review project progress with stakeholders",
				LocalDate.parse("2024-05-31")));
	}

	private static int findTaskID() {
		System.out.println("Enter Task Id: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		if (!taskMap.containsKey(id)) {
			throw new TaskException("No task found with specified ID...!!!");
		}
		return id;
	}

	public static void deleteTask() {
		int id = findTaskID();
		taskMap.get(id).setActive(false);
			System.out.println("Task Succesfully Completed...!!!");
	}

	public static void updateTaskStatus() {
		scanner.nextLine();
		int id = findTaskID();
		StatusType status = StatusType.valueOf(scanner.next().toUpperCase());
		taskMap.values().stream().filter(t -> taskMap.containsKey(id)).forEach(t -> t.setStatus(status));
		System.out.println("Status Updated Successfully...!!!");
	}

	public static void displayPendingTasks() {
		taskMap.values().stream().filter(t -> t.getStatus() == StatusType.PENDING).forEach(t -> System.out.println(t));
	}

	public static void displayPendingTaskToday() {
		taskMap.values().stream()
				.filter(t -> t.getStatus() == StatusType.PENDING && t.getTaskDate().equals(LocalDate.now()))
				.forEach(t -> System.out.println(t));
	}

	public static void sortedTasks() {
		taskMap.values().stream().sorted((t1, t2) -> t1.getTaskDate().compareTo(t2.getTaskDate()))
				.forEach(t -> System.out.println(t));
	}

	public static int menuList() {
		System.out.println("0. EXIT");
		System.out.println("1. Add New Task\r\n" + "2. Delete a task \r\n" + "3. Update task status \r\n"
				+ "4. Display all pending tasks \r\n" + "5. Display all pending tasks for today \r\n"
				+ "6.  Display all tasks sorted by taskDate");
		System.out.print("Enter Choice: ");
		return scanner.nextInt();
	}

}
