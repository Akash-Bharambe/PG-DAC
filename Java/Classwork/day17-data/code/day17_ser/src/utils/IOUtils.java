package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.shop.core.Product;

public interface IOUtils {
//add a static method to store product details(map) in bin file using ser.
	static void storeProductDetails(Map<Integer, Product> productMap, 
			String fileName) throws IOException {
		// Java App --> OOS --> bin strm --> FOS --> bin file
		try (ObjectOutputStream out = 
				new ObjectOutputStream(new FileOutputStream(fileName))) {
			out.writeObject(productMap);// ser.
		} //JVM : out.close --> fos.close
	}

	
}
