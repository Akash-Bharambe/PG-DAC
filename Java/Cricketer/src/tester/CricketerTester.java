package tester;

import static utils.Utils.addCricketer;
import static utils.Utils.displayAllCricketer;
import static utils.Utils.modifyRating;
import static utils.Utils.searchCricketer;
import static utils.Utils.sortByRating;

public class CricketerTester {

	public static void main(String[] args) {
		int ch;
		while ((ch = utils.Utils.menuList()) != 0) {
			try {
				switch (ch) {
				case 1:
					addCricketer();
					break;
				case 2:
					modifyRating();
					break;
				case 3:
					searchCricketer();
					break;
				case 4:
					displayAllCricketer();
					break;
				case 5:
					sortByRating();
					break;

				default:
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
