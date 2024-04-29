package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import core.Stock;

/**
 * Utility class for input/output operations related to stocks.
 */
public class IOUtils {

	/**
	 * Saves the details of stocks to a file.
	 * 
	 * @param stocks A map containing stock details, where keys are stock IDs.
	 * @throws IOException If an I/O error occurs while writing to the file.
	 */
	public static void saveStockDetails(Map<String, Stock> stocks) throws IOException {
		try (ObjectOutputStream oStream = new ObjectOutputStream(new FileOutputStream("stocks.ser"))) {
			oStream.writeObject(stocks);
		}
	}

	/**
	 * Loads the details of stocks from a file.
	 * 
	 * @return A map containing stock details, where keys are stock IDs.
	 * @throws IOException            If an I/O error occurs while reading from the
	 *                                file.
	 * @throws ClassNotFoundException If the class of a serialized object cannot be
	 *                                found.
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, Stock> loadStockDetails() throws IOException, ClassNotFoundException {
		try (ObjectInputStream iStream = new ObjectInputStream(new FileInputStream("stocks.ser"))) {
			return (Map<String, Stock>) iStream.readObject();
		}
	}
}
