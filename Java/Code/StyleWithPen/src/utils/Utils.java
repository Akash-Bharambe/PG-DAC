package utils;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.app.Pen;
import com.app.PenMaterialType;

public class Utils {

	private static Scanner scanner = new Scanner(System.in);

	public static int menuList() {
		System.out.println("1. Add Pen");
		System.out.println("2. Update Stock");
		System.out.println("3. Set Discount for pens older than 3 months");
		System.out.println("4. Remove Pens older than 9 months");
		System.out.println("5. Display all pens");
		return scanner.nextInt();
	}
	
	public static void populateList(List<Pen> pens) {
		pens.add(new Pen("Reynolds", "Blue", PenMaterialType.METAL, 20, LocalDate.parse("2022-09-25"), 115));
		pens.add(new Pen("Parker", "Black", PenMaterialType.METAL, 21, LocalDate.parse("2022-09-26"), 120));
		pens.add(new Pen("Montblanc", "Silver", PenMaterialType.METAL, 22, LocalDate.parse("2022-09-27"), 250));
		pens.add(new Pen("Lamy", "Red", PenMaterialType.PLASTIC, 23, LocalDate.parse("2022-09-28"), 30));
		pens.add(new Pen("Cross", "Gold", PenMaterialType.METAL, 24, LocalDate.parse("2022-09-29"), 180));
		pens.add(new Pen("Waterman", "Green", PenMaterialType.METAL, 25, LocalDate.parse("2022-09-30"), 140));
		pens.add(new Pen("Sheaffer", "Purple", PenMaterialType.PLASTIC, 26, LocalDate.parse("2022-10-01"), 25));
		pens.add(new Pen("Faber-Castell", "Brown", PenMaterialType.PLASTIC, 27, LocalDate.parse("2022-10-02"), 20));
		pens.add(new Pen("Rotring", "Gray", PenMaterialType.METAL, 28, LocalDate.parse("2022-10-03"), 100));
		pens.add(new Pen("Staedtler", "Orange", PenMaterialType.PLASTIC, 29, LocalDate.parse("2022-10-04"), 15));
	}

	public static Pen addPen(List<Pen> pens) {
		scanner.nextLine();
		System.out.print("Enter brand: ");
		String brand = scanner.nextLine();

		System.out.print("Enter color: ");
		String color = scanner.nextLine();

		System.out.print("Enter material (PLASTIC, METAL, OTHER): ");
		PenMaterialType material = PenMaterialType.valueOf(scanner.nextLine().toUpperCase());

		System.out.print("Enter stock: ");
		int stock = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter stock listing date (yyyy-MM-dd): ");
		LocalDate stockListingDate = LocalDate.parse(scanner.nextLine());

		System.out.print("Enter price: ");
		int price = scanner.nextInt();

		return new Pen(brand, color, material, stock, stockListingDate, price);
	}

	public static void updateStock(List<Pen> pens) {
		System.out.print("Enter brand: ");
		String brand = scanner.nextLine();

		System.out.print("Enter color: ");
		String color = scanner.nextLine();

		System.out.print("Enter material (PLASTIC, METAL, OTHER): ");
		PenMaterialType material = PenMaterialType.valueOf(scanner.nextLine().toUpperCase());

		System.out.println("Enter quantity added: ");
		int quantity = scanner.nextInt();
		
		pens.stream().filter(p -> p.equals(new Pen(brand, color, material)))
				.forEach(p -> p.setStock(p.getStock() + quantity));
		System.out.println("Stock updated...!!!");
	}
	
	public static void setDiscount(List<Pen> pens) {
		pens.stream().filter(p -> p.getStockUpdateDate().plusMonths(3).isBefore(LocalDate.now())).forEach(p->p.setDiscount(0.2));
	}
	
	public static void removeUnsoldPens(List<Pen>pens) {
		pens.stream().filter(p -> p.getStockUpdateDate().plusMonths(9).isBefore(LocalDate.now())).forEach(p-> pens.remove(p));
	}
}
