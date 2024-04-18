package tester;

import java.util.ArrayList;
import java.util.List;

import static utils.Utils.*;
import watch.Watch;

public class Program {

	public static void main(String[] args) {
		List<Watch> watchList =  new ArrayList<>();
		populateList(watchList);
		int ch;
		while ((ch = menuList()) != 0) {
			try {
				switch (ch) {
				case 1:
					addWatch(watchList);
					break;
				case 2:
					updateStock(watchList);
					break;
				case 3:
					setDiscount(watchList);
					break;
				case 4:
					removeUnsoldWatches(watchList);
					break;
				case 5:
					watchList.forEach(w -> System.out.println(w));
					break;

				default:
					break;
				}
			} catch (RuntimeException e) {
				e.printStackTrace();
			}
			
		}

	}

}
