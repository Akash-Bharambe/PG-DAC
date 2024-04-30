package tester;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.core.CategoryType;
import com.core.Shoe;

import util.Utils;

public class Program {
	public static void main(String[] args) {
		Map<Integer, Shoe> shoeMap = new HashMap<>();
		Program.getData(shoeMap);
		
		int ch;
		while ((ch = Utils.menuList()) != 0) {
			try {
				switch (ch) {
				case 1:
					Utils.addNewShoe(shoeMap);
					break;
				case 2:
					Utils.updateShoeStock(shoeMap);
					break;
				case 3:
					Utils.setDiscount(shoeMap);
					break;
				case 4:
					Utils.removeShoes(shoeMap);
					break;
				case 5:
					shoeMap.values().forEach(System.out::println);
					break;
				default:
					System.out.println("Please enter Valid Input...!!!\n");
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Method to add sample data
	 * 
	 * @param shoeMap Map in which data is to be added
	 */
	private static void getData(Map<Integer, Shoe> shoeMap) {
		
		shoeMap.put(1234, new Shoe(1234, CategoryType.MENS_RUNNING_SHOES, LocalDate.parse("2023-02-02"), 10,
				LocalDate.parse("2023-02-02"), 9000.50, 0));
		
		shoeMap.put(2345, new Shoe(2345, CategoryType.MENS_SNEAKERS, LocalDate.parse("2024-02-02"), 20,
				LocalDate.parse("2024-02-02"), 9050.50, 0));
		
		shoeMap.put(3456, new Shoe(3456, CategoryType.MENS_WALKING_SHOES, LocalDate.parse("2022-02-02"), 30,
				LocalDate.parse("2023-02-02"), 9600.50, 0));
		
		shoeMap.put(4567, new Shoe(4567, CategoryType.WOMENS_RUNNING_SHOES, LocalDate.parse("2023-02-02"), 40,
				LocalDate.parse("2024-02-02"), 9000.50, 0));
		
		shoeMap.put(5678, new Shoe(5678, CategoryType.WOMENS_SNEAKERS, LocalDate.parse("2023-03-02"), 50,
				LocalDate.parse("2023-12-02"), 8000.50, 0));
		
		shoeMap.put(6789, new Shoe(6789, CategoryType.WOMENS_WALKING_SHOES, LocalDate.parse("2023-02-02"), 60,
				LocalDate.parse("2023-12-02"), 9900.50, 0));
	}
}
