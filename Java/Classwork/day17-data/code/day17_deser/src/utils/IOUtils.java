package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;

public interface IOUtils {


	// add a static method to restore product details(map) from bin file using
	// de-ser.
	static Object restoreProductDetails(String fileName)
			throws IOException, ClassNotFoundException, 
			InvalidClassException {
		// Java App <----OIS <----FIS <--- bin file
		try (ObjectInputStream in = 
				new ObjectInputStream(new FileInputStream(fileName))) {
			return in.readObject();//de-ser.
		}
	}
}
