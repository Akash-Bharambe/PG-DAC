package app.tester;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import app.customer.Customer;
import app.utils.Utils;

public class Tester {

	public static void main(String[] args) {
		Map<String, Customer> map = new HashMap<>();
		Thread populateThread = new Thread(() -> {
			System.out.println(Thread.currentThread().getName()+" thread started populating map");
			Utils.populateList(map);
			System.out.println(Thread.currentThread().getName()+" thread finished populating map");
			
		}, "populateThread");
		Thread sortThread = new Thread(() -> {
			try {
				populateThread.join();
				System.out.println(Thread.currentThread().getName()+" thread started sorting");
				try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
						new FileOutputStream("customers1.ser"))) {
					map.values().stream().sorted((c1, c2) -> c1.getDob().compareTo(c2.getDob())).forEach(c -> {
						try {
							objectOutputStream.writeObject(c);
						} catch (IOException e) {
							e.printStackTrace();
						}
					});
					System.out.println(Thread.currentThread().getName()+" thread finished sorting");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}, "sortThread");

		Thread sortPlanThread = new Thread(() -> {
			try {
				populateThread.join();
				System.out.println(Thread.currentThread().getName()+" thread started sorting");
				try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
						new FileOutputStream("customers2.ser"))) {
					map.values().stream().sorted((c1, c2) -> c1.getPlan().compareTo(c2.getPlan())).forEach(c -> {
						try {
							objectOutputStream.writeObject(c);
						} catch (IOException e) {
							e.printStackTrace();
						}
					});
					System.out.println(Thread.currentThread().getName()+" thread finished sorting");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}, "sortPlanThread");

		populateThread.start();
		sortThread.start();
		sortPlanThread.start();

		try {
			populateThread.join();
			sortThread.join();
			sortPlanThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main Over");

	}
}
