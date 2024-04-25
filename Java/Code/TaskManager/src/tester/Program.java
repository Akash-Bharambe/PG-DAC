package tester;

import static utils.Utils.addTask;
import static utils.Utils.deleteTask;
import static utils.Utils.displayPendingTaskToday;
import static utils.Utils.displayPendingTasks;
import static utils.Utils.menuList;
import static utils.Utils.populateTaskMap;
import static utils.Utils.sortedTasks;
import static utils.Utils.updateTaskStatus;

public class Program {

	public static void main(String[] args) {
		int ch;
		populateTaskMap();

		while ((ch = menuList()) != 0) {
			try {
				switch (ch) {
				case 1:
					addTask();
					break;
				case 2:
					deleteTask();
					break;
				case 3:
					updateTaskStatus();
					break;
				case 4:
					displayPendingTasks();
					break;
				case 5:
					displayPendingTaskToday();
					break;
				case 6:
					sortedTasks();
					break;

				default:
					System.out.println("Enter Valid Input...!!!");
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
