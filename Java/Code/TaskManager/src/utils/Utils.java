package utils;

import java.time.LocalDate;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import com.app.StatusType;
import com.app.Task;

public class Utils {
	private static Map<Integer, Task> taskMap;
	private static Scanner scanner = new Scanner(System.in);
	private static Random random;

	static {
		random = new Random(1000);
	}

	public static void addTask() {
		scanner.nextLine();
		System.out.println("Enter Task Name: ");
		String name = scanner.nextLine();

		System.out.println("Enter task Description: ");
		String description = scanner.nextLine();

		System.out.println("Enter Task Date(yyyy-mm-dd): ");
		LocalDate date = LocalDate.parse(scanner.nextLine());
		int id = random.nextInt();
		taskMap.put(id, new Task(id, name, description, date));
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
		if (taskMap.remove(id) != null)
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
