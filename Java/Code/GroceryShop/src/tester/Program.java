package tester;

import static com.util.Utils.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import com.core.Grocery;

public class Program {

	public static void main(String[] args) {
		Map<String, Grocery> map = new HashMap<>();
		map.put("Potato", new Grocery("Potato", 20, 20, LocalDateTime.of(LocalDate.parse("2024-01-23"), LocalTime.parse("10:15:30"))));
		map.put("Tomato", new Grocery("Tomato", 0, 20, LocalDateTime.of(LocalDate.parse("2024-01-23"), LocalTime.parse("10:15:30"))));
		map.put("aloo", new Grocery("aloo", 0, 20, LocalDateTime.of(LocalDate.parse("2024-01-23"), LocalTime.parse("10:15:30"))));
		map.put("onion", new Grocery("onion", 2, 20, LocalDateTime.of(LocalDate.parse("2024-01-23"), LocalTime.parse("10:15:30"))));
		map.put("Cabbage", new Grocery("Cabbage", 8, 20, LocalDateTime.of(LocalDate.parse("2024-01-23"), LocalTime.parse("10:15:30"))));
		map.put("apple", new Grocery("apple", 9, 20, LocalDateTime.of(LocalDate.parse("2024-01-23"), LocalTime.parse("10:15:30"))));
		map.put("mango", new Grocery("mango", 2, 20, LocalDateTime.of(LocalDate.parse("2024-01-23"), LocalTime.parse("10:15:30"))));
		map.put("chikoo", new Grocery("chikoo", 12, 20, LocalDateTime.of(LocalDate.parse("2024-01-23"), LocalTime.parse("10:15:30"))));
		map.put("watermelon", new Grocery("watermelon", 89, 20, LocalDateTime.of(LocalDate.parse("2024-01-23"), LocalTime.parse("10:15:30"))));
		map.put("bhendi", new Grocery("bhendi", 23, 20, LocalDateTime.of(LocalDate.parse("2024-01-23"), LocalTime.parse("10:15:30"))));
		map.put("orange", new Grocery("orange", 20, 20, LocalDateTime.of(LocalDate.parse("2024-01-23"), LocalTime.parse("10:15:30"))));
		map.put("pear", new Grocery("pear", 20, 20, LocalDateTime.of(LocalDate.parse("2024-01-23"), LocalTime.parse("10:15:30"))));
		int ch;
		while ((ch = menuList())!= 0) {
			try {
				switch (ch) {
				case 1:
					addNewItem(map);
					break;
				case 2:
					updateQuantity(map);
					break;
				case 3:
					displayItems(map);
					break;
				case 4:
					removeOutOfStock(map);
					break;
				case 5:
					displayLowestQuantity(map);
					break;
				default:
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
