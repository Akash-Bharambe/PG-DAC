package tester;

import static utils.Utils.*;

public class Program {

	public static void main(String[] args) {
		int ch;
		while ((ch = menuList())!= 0) {
			try {
				switch (ch) {
				case 1:
					login();
					break;
				case 2:
					addPet();
					break;
				case 3:
					updatePetDetails();
					break;
				case 4:
					displayAllPets();
					break;
				case 5:
					orderPet();
					break;
				case 6:
					checkOrderStatus();
					break;
				case 7:
					updateOrderStatus();
					break;
				case 8:
					signUp();
					break;

				default:
					System.out.println("Enter Valid Input...!!!\n");
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
