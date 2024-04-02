//4.2 Display food menu to user. User will select items from menu along with the quantity.
//(eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
//When user enters 'Generate Bill' option(10) , display total bill & exit.

import java.util.Scanner;

public class Food{
	
	private static int menulist(Scanner sc){
		System.out.println("1. Dosa");
		System.out.println("2. Samosa");
		System.out.println("3. Idli");
		System.out.println("4. Kachori");
		System.out.println("5. Jalebi");
		System.out.println("6. Fafda");
		System.out.println("7. Uttapa");
		System.out.println("8. Burger");
		System.out.println("9. Pizza");
		System.out.println("10. Generate Bill");
		System.out.print("Enter Choice: ");
		return sc.nextInt();
	}
	
	private static int getQuantity(Scanner sc){
		System.out.print("Enter Qunatity: ");
		return sc.nextInt();
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String recipt = "";
		int ch;
		int totalBill = 0;
		int quantity;
		while((ch = menulist(sc)) != 0){
			switch(ch){
				case 1:
					quantity = getQuantity(sc);
					totalBill += quantity * 30;
					recipt += "Dosa\t   " + quantity + " \t\t30\t" + quantity * 30+ "\n";
					break;
				case 2:
					quantity = getQuantity(sc);
					totalBill += quantity * 10;
					recipt += "Samosa\t   " + quantity + " \t\t10\t" + quantity * 10+ "\n";
					break;
				case 3:
					quantity = getQuantity(sc);
					totalBill += quantity * 20;
					recipt += "Idli\t   " + quantity + " \t\t20\t" + quantity * 20 +"\n";
					break;
				case 4:
					quantity = getQuantity(sc);
					totalBill += quantity * 10;
					recipt += "Kachori\t   " + quantity + " \t\t10\t" + quantity * 10 +"\n";
					break;
				case 5:
					quantity = getQuantity(sc);
					totalBill += quantity * 25;
					recipt += "Jalebi\t   " + quantity + " \t\t25\t" + quantity * 25 +"\n";
					break;
				case 6:
					quantity = getQuantity(sc);
					totalBill += quantity * 15;
					recipt += "Fafda\t   " + quantity + " \t\t15\t" + quantity * 15 +"\n";
					break;
				case 7:
					quantity = getQuantity(sc);
					totalBill += quantity * 20;
					recipt += "Utappa\t   " + quantity + " \t\t20\t" + quantity * 20 +"\n";
					break;
				case 8:
					quantity = getQuantity(sc);
					totalBill += quantity * 20;
					recipt += "Burger\t   " + quantity + " \t\t20\t" + quantity * 20 +"\n";
					break;
				case 9:
					quantity = getQuantity(sc);
					totalBill += quantity * 50;
					recipt += "Pizza\t   " + quantity + " \t\t50\t" + quantity * 50 +"\n";
					break;
				case 10:
					System.out.printf("\nItem \tQuantity \tRate \tPrice\n"); 
					System.out.println("-----------------------------------------------------");
					System.out.println(recipt);
					System.out.println("Total Bill: " + totalBill);
					sc.close();
					System. exit(0);
					break;
			}
		}
	}
	
	
	
}