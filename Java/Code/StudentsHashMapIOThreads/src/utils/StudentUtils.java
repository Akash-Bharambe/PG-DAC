package utils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import core.Student;
import core.Subject;

public interface StudentUtils {
	public static Map<Integer, Student> populateMap() {
		// Adding sample student data to the map
		Map<Integer, Student> studentMap = new HashMap<>();
		studentMap.put(101, new Student(101, "Alice Smith", Subject.ENGLISH, LocalDate.of(2002, 3, 10)));
		studentMap.put(102, new Student(102, "Bob Johnson", Subject.MATHS, LocalDate.of(2001, 7, 20)));
		studentMap.put(103, new Student(103, "Eva Brown", Subject.SCIENCE, LocalDate.of(2003, 1, 5)));
		studentMap.put(104, new Student(104, "David Lee", Subject.HISTORY, LocalDate.of(2000, 9, 15)));
		studentMap.put(105, new Student(105, "Sophia Wilson", Subject.COMPUTER_SCIENCE, LocalDate.of(2002, 5, 30)));
		studentMap.put(106, new Student(106, "James Miller", Subject.GEOGRAPHY, LocalDate.of(2001, 11, 8)));
		studentMap.put(107, new Student(107, "Olivia Davis", Subject.ENGLISH, LocalDate.of(2003, 2, 12)));
		studentMap.put(108, new Student(108, "William Taylor", Subject.MATHS, LocalDate.of(2000, 8, 25)));
		studentMap.put(109, new Student(109, "Emma Anderson", Subject.SCIENCE, LocalDate.of(2002, 4, 18)));
		studentMap.put(110, new Student(110, "Michael Thomas", Subject.HISTORY, LocalDate.of(2001, 12, 3)));
		return studentMap;
	}
}
