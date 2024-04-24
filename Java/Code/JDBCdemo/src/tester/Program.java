package tester;

import java.sql.SQLException;
import java.util.Scanner;

import co.doa.UserDOA;
import co.doa.UserDOAImpl;

public class Program {

	public static void main(String[] args) {
		UserDOA userDOA = new UserDOAImpl();
		
		try(Scanner scanner = new Scanner(System.in)) {
			userDOA.openConnection();
			System.out.println("Enter email and password: ");
			userDOA.authenticateUser(scanner.next(), scanner.next());
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
