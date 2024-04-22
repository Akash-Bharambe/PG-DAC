package app.tester;

import static app.utils.IOUtils.restoreDetails;
import static app.utils.IOUtils.storeDetails;
import static app.utils.Utils.changePassword;
import static app.utils.Utils.displayAllCustomers;
import static app.utils.Utils.filterPaln;
import static app.utils.Utils.menuList;
import static app.utils.Utils.populateList;
import static app.utils.Utils.signIn;
import static app.utils.Utils.signUp;
import static app.utils.Utils.sortBalance;
import static app.utils.Utils.sortDOB;
import static app.utils.Utils.sortEmailAsc;
import static app.utils.Utils.sortEmailDesc;
import static app.utils.Utils.unsubscribe;

import java.util.HashMap;
import java.util.Map;

import app.customer.Customer;

public class Tester {

	public static void main(String[] args) {
		Map<String, Customer> customersMap = new HashMap<>();
		populateList(customersMap);
		int ch;
		while ((ch = menuList()) != 0) {
			try {
				switch (ch) {
				case 1:
					signUp(customersMap);
					break;
				case 2:
					signIn(customersMap);
					break;
				case 3:
					changePassword(customersMap);
					break;
				case 4:
					unsubscribe(customersMap);
					break;
				case 5:
					displayAllCustomers(customersMap);
					break;
				case 6:
					sortEmailAsc(customersMap);
					break;
				case 7:
					sortEmailDesc(customersMap);
					break;
				case 8:
					sortBalance(customersMap);
					break;
				case 9:
					sortDOB(customersMap);
					break;
				case 10:
					filterPaln(customersMap);
					break;
				case 11:
					storeDetails(customersMap);
					break;
				case 12:
					customersMap = restoreDetails();
					break;
				default:
					System.out.println("Please Enter Valid Input...!!!");
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
