package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import core.Student;

public interface IOUtils {
	public static void sortDOB(Map<Integer, Student> students, String filename) {
		Object[] array = students.values().stream()
				.sorted((s1, s2) -> s1.getDateOfBirth().compareTo(s2.getDateOfBirth())).toArray();
		storeData(array, filename);
	}

	public static void sortSubject(Map<Integer, Student> students, String filename) {
		Object[] array = students.values().stream().sorted((s1, s2) -> s1.getSubject().compareTo(s2.getSubject()))
				.toArray();
		storeData(array, filename);
	}

	public static void storeData(Object[] array, String filename) {
		try (PrintWriter oStream = new PrintWriter(new FileOutputStream(filename))) {
			for (int i = 0; i < array.length; i++)
				oStream.println(array[i]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void restoreData(String filename) {
		try (BufferedReader is = new BufferedReader(new FileReader(filename))) {
			String string = "";
			do {
				string = is.readLine();
				if (string != null) {
					System.out.println(string);
				}
			} while (string != null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
