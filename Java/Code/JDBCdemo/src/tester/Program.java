package tester;

import java.sql.SQLException;
import java.util.Scanner;

import co.doa.UserDOA;
import co.doa.UserDOAImpl;
import core.User;

public class Program {

	public static void main(String[] args) {
		UserDOA userDOA = new UserDOAImpl();
		
		try(Scanner scanner = new Scanner(System.in)) {
			userDOA.openConnection();
			System.out.println("Enter email and password: ");
			User user = userDOA.authenticateUser(scanner.next(), scanner.next());
			if (user != null)
				System.out.println("Login Success...!");
			else System.out.println("Invalid email or password...!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
