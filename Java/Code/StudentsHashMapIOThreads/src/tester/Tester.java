package tester;

import java.util.HashMap;
import java.util.Map;

import core.Student;

public class Tester {

	public static void main(String[] args) {
		// Creating a map to store students
		Map<Integer, Student> studentMap = new HashMap<>();

		// Printing the student details from the map
		for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
			System.out.println("Roll No: " + entry.getKey() + ", Student: " + entry.getValue());
		}
	}
}
