package tester;

import static util.Utils.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.core.Contact;

public class Program {

	public static void main(String[] args) {
		Map<String, Contact> contactsMap = new HashMap<>();
		contactsMap.put("Akash", new Contact("8411840325", "Akash", LocalDate.parse("2002-06-26"), "akash@gmail.com"));
		contactsMap.put("Sakshi",
				new Contact("8411840325", "sakshi", LocalDate.parse("2001-09-29"), "sakshi@gmail.com"));
		contactsMap.put("Ramesh",
				new Contact("5465465645", "Ramesh", LocalDate.parse("1990-06-26"), "ramesh@gmail.com"));
		int ch;
		while ((ch = menuList()) != 0) {
			try {
				switch (ch) {
				case 1:
					addNewContact(contactsMap);
					break;
				case 2:
					displayAllContacts(contactsMap);
					break;
				case 3:
					updateDetails(contactsMap);
					break;
				case 4:
					removeContacts(contactsMap);
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
