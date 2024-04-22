package app.utils;

import static app.utils.Utils.populateList;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import app.customer.Customer;

public class IOUtils {
	public static void storeDetails(Map<String, Customer> map) throws FileNotFoundException, IOException {
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("customers.ser"))) {
			populateList(map);
			outputStream.writeObject(map);
			System.out.println("Done Writing");
		}
	}

	@SuppressWarnings("unchecked")
	public static HashMap<String, Customer> restoreDetails()
			throws FileNotFoundException, IOException, ClassNotFoundException {
		HashMap<String, Customer> map = new HashMap<String, Customer>();
		try (FileInputStream in = new FileInputStream("customers.ser")) {
			if (in.available() != 0) {

				try (ObjectInputStream inputStream = new ObjectInputStream(in)) {

					Object obj = inputStream.readObject();
					if (obj instanceof HashMap) {
						map = ((HashMap<String, Customer>) obj);
					}
					System.out.println("Reading Complete");
				}
			}else {
				System.out.println("Empty File");
			}
		}
		return map;
	}
}
