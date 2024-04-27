package tester;

import static util.Utils.*;

public class Program {

	public static void main(String[] args) {
		int ch;
		while ((ch = menuList()) != 0) {
			try {
				switch (ch) {
				case 1:
					addFullTimeEmployee();
					break;
				case 2:
					addPartTimeEmployee();
					break;
				case 3:
					deleteEmployee();
					break;
				case 4:
					searchEmpDetails();
					break;
				case 5:
					displayAllEmployee();
					break;
				case 6:
					displayAllEmployeeSorted();
					break;

				default:
					System.out.println("Please Enter a valid Choice...!!!\n");
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
