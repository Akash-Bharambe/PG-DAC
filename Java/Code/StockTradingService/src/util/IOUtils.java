package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import core.Stock;

public class IOUtils {
	
	 public static void saveStockDetails(Map<String, Stock> stocks) throws IOException {
	        try (ObjectOutputStream oStream = new ObjectOutputStream(new FileOutputStream("stocks.ser"))) {
	            oStream.writeObject(stocks);
	        }
	    }

	    @SuppressWarnings("unchecked")
		public static Map<String, Stock> loadStockDetails() throws IOException, ClassNotFoundException {
	        try (ObjectInputStream iStream = new ObjectInputStream(new FileInputStream("stocks.ser"))) {
	            return (Map<String, Stock>) iStream.readObject();
	        }
	    }
}
