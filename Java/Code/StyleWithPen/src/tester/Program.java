package tester;

import static utils.Utils.addPen;
import static utils.Utils.menuList;
import static utils.Utils.removeUnsoldPens;
import static utils.Utils.setDiscount;
import static utils.Utils.updateStock;

public class Program {
	public static void main(String[] args) {
		int ch;
		while ((ch = menuList()) != 0) {
			try {
				switch (ch) {
				case 1:
					addPen();
					break;
				case 2:
					updateStock();
					break;
				case 3:
					setDiscount();
					break;
				case 4:
					removeUnsoldPens();
					break;
				case 5:
					utils.Utils.displayAllPens();
				default:
					System.out.println("Invalid Input...!!!");
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
