package doa;

import static app.customer.ValidationRules.validateEmail;
import static app.customer.ValidationRules.validatePass;
import static app.customer.ValidationRules.validatePlan;
import static app.customer.ValidationRules.validateRegistrationAmount;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import app.customer.Customer;
import app.customer.PlanType;
import app.exception.CustomerException;

public class DOAImpl implements DOA {

	private static Scanner scanner = new Scanner(System.in);
	private Connection cn;
	private PreparedStatement authCustomer;
	private PreparedStatement addCustomer;
	private PreparedStatement allCustomerStatement;

	public DOAImpl() throws SQLException {
		this.cn = DBUtils.openConnection();
		this.allCustomerStatement = cn.prepareStatement("SELECT * FROM Customers");
		this.authCustomer = cn.prepareStatement("SELECT * FROM Customers WHERE email = ? AND pass = ?");
		this.addCustomer = cn.prepareStatement(
				"INSERT INTO Customers (fname, lname, email, pass, amt, dob, plan) VALUES (?, ?, ?, ?, ?, ?, ?)");
	}

	@Override
	public void addCustomer() throws CustomerException, SQLException {
		System.out.print("Enter Full Name: ");
		String fName = scanner.next();
		String lName = scanner.next();

		addCustomer.setString(1, fName);
		addCustomer.setString(2, lName);

		System.out.print("Enter email: ");
		String email = scanner.next();
		validateEmail(email.toLowerCase(), allCustomerStatement);
		addCustomer.setString(3, email);

		System.out.print(
				"Enter password (Passsword must contain 1 atleast Uppercase letter, 1 Lowercase Letter, 1 symbol and at least 1 number) : ");
		String pass = validatePass(scanner.next());
		addCustomer.setString(4, pass);

		System.out.print("Enter Plan: ");
		String plan = scanner.next();
		PlanType planType = validatePlan(plan);
		addCustomer.setString(7, plan);

		System.out.print("Enter Registration Amount: ");
		double registrationAmount = scanner.nextDouble();
		validateRegistrationAmount(planType, registrationAmount);
		addCustomer.setDouble(5, registrationAmount);

		System.out.print("Enter BirthDate(yyyy-mm-dd): ");
		String dob = scanner.next();
		addCustomer.setDate(6, Date.valueOf(dob));

		int rows = addCustomer.executeUpdate();
		if (rows > 0)
			System.out.println("Customer Added...");
		else
			System.out.println("Cannot Add...");
	}

	@Override
	public void closeConnection() throws SQLException {
		if (cn != null)
			cn.close();
		if (authCustomer != null)
			authCustomer.close();
	}

	@Override
	public Customer authenticateCustomer(String email, String pass) throws SQLException {
		authCustomer.setString(1, email);
		authCustomer.setString(2, pass);
		try (ResultSet rs = authCustomer.executeQuery()) {
			return new Customer(rs.getString(2), rs.getString(3), email, pass, rs.getDouble(6),
					rs.getDate(7).toLocalDate(), PlanType.valueOf(rs.getString(8)));
		}
	}

}
