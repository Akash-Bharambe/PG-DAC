package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import core.Student;

public interface IOUtils {
	public static void storeData(Map<Integer, Student> students, String filename) {
		try (ObjectOutputStream oStream = new ObjectOutputStream(new FileOutputStream(filename))) {
			oStream.writeObject(students);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Map<Integer, Student> restoreData( String filename) {
		try(ObjectInputStream iStream= new ObjectInputStream(new FileInputStream(filename))){
			Object object = iStream.readObject();
			@SuppressWarnings("unchecked")
			Map<Integer, Student> students= (Map<Integer, Student>)object;
			return students;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
