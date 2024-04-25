package tester;

import java.util.Map;

import core.Student;
import utils.IOUtils;
import utils.StudentUtils;

public class Tester {
	public static Map<Integer, Student> studentMap;

	public static void main(String[] args) {
		// Creating a map to store students

		Thread t1 = new Thread(() -> {
			studentMap = StudentUtils.populateMap();
		}, "getMapTask");

		Thread t2 = new Thread(() -> {
			try {
				t1.join();
				IOUtils.sortDOB(studentMap, "DOB.txt");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}, "sortDate");

		Thread t3 = new Thread(() -> {
			try {
				t1.join();
				IOUtils.sortSubject(studentMap, "Subjects.txt");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}, "sortSubjects");

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
