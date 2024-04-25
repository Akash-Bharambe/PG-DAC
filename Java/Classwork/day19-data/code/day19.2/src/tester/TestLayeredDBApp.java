package tester;

import java.util.Scanner;

import dao.UserDao;
import dao.UserDaoImpl;
import pojos.User;

public class TestLayeredDBApp {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init phase --create dao
			UserDaoImpl userDao = new UserDaoImpl();
			boolean exit = false;
			while (!exit) {
				// options 1. Login 0. Exit
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter email n pwd");
						User user = userDao.authenticateUser(sc.next(), sc.next());
						if(user != null)
							System.out.println("Login success , "+user);
						else
							System.out.println("Invalid Login !!!!!!");
						break;

					case 0:
						exit = true;
						userDao.cleanUp();
						break;
					}
				} catch (Exception e) {
					sc.nextLine();
					System.out.println(e);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
