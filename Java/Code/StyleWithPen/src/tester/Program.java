package tester;

import static utils.Utils.populateList;

import java.util.ArrayList;
import java.util.List;

import com.app.Pen;

public class Program {
	public static void main(String[] args) {
		List<Pen> pens = new ArrayList<>();
		populateList(pens);
		int ch;
		while ((ch = utils.Utils.menuList()) != 0) {
			try {
				switch (ch) {
				case 1:
					pens.add(utils.Utils.addPen(pens));
					break;
				case 2:
					utils.Utils.updateStock(pens);
					break;
				case 3:
					utils.Utils.setDiscount(pens);
					break;
				case 4:
					utils.Utils.removeUnsoldPens(pens);
					break;
				case 5:
					pens.forEach(p -> System.out.println(p));
				default:
					System.out.println("Invalid Input...!!!");
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
