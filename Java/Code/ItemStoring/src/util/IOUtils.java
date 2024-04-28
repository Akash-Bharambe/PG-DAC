package util;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import core.Item;

public class IOUtils {

	private static List<Item> tempItems = new ArrayList<>();

	public static void populateData(List<Item> items) {
		items.add(new Item("ITEM-01", "Laptop", 60000.0, LocalDate.parse("2023-09-09")));
		items.add(new Item("ITEM-02", "Smartphone", 1000.0, LocalDate.parse("2023-10-15")));
		items.add(new Item("ITEM-03", "Camera", 1500.0, LocalDate.parse("2023-08-25")));
		items.add(new Item("ITEM-04", "Headphones", 200.0, LocalDate.parse("2023-11-30")));
		items.add(new Item("ITEM-05", "Tablet", 800.0, LocalDate.parse("2023-07-10")));
		items.add(new Item("ITEM-06", "Gaming Console", 400.0, LocalDate.parse("2023-12-05")));
	}

	public static void readData(String file) throws FileNotFoundException, IOException, ClassNotFoundException {
		try (ObjectInputStream iStream = new ObjectInputStream(new FileInputStream(file))) {
			while (true) {
				try {
					Object obj = iStream.readObject();
					if (obj instanceof Item) {
						Item item = (Item) obj;
						System.out.println(item.toString());
						tempItems.add(item);
					}
				} catch (EOFException e) {
					System.out.println("EOF reached...!!!\n");
					break;
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	private static Set<Item> copyData(List<Item> items, Comparator<Item> comparator) {
		if (comparator == null) {
			comparator = (Comparator<Item>) Comparator.naturalOrder();
		}
		Set<Item> newSet = new TreeSet<>(comparator);
		newSet.addAll(items);
		newSet.addAll(tempItems);
		return newSet;
	}

	public static void sortItemCode(List<Item> items) throws FileNotFoundException, IOException {
		Set<Item> data = copyData(items, (i1, i2) -> i1.getItemCode().compareTo(i2.getItemCode()));
		try (ObjectOutputStream oStream = new ObjectOutputStream(new FileOutputStream("items_codes.ser"))) {

			data.forEach(i -> {
				try {
					oStream.writeObject(i);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		}
	}

	public static void sortPrice(List<Item> items) throws FileNotFoundException, IOException {
		Set<Item> data = copyData(items, (i1, i2) -> ((Double) i1.getPrice()).compareTo(i2.getPrice()));

		try (ObjectOutputStream oStream = new ObjectOutputStream(new FileOutputStream("items_price.ser"))) {
			data.forEach(i -> {
				try {
					oStream.writeObject(i);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		}
	}
}
