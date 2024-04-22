package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.shop.core.Product;

public interface IOUtils {
//add a static method to store product details(map) in bin file using ser.
	static void storeProductDetails(Map<Integer, Product> productMap, String fileName) throws IOException {
		// Java App --> OOS --> bin strm --> FOS --> bin file
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			out.writeObject(productMap);// ser.
		}
	}

	// add a static method to restore product details(map) from bin file using
	// de-ser.
	static Object restoreProductDetails(String fileName)
			throws IOException, ClassNotFoundException, 
			InvalidClassException {
		// Java App <----OIS <----FIS <--- bin file
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
			return in.readObject();
		}
	}
}
