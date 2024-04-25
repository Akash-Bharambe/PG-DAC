package app.customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import app.exception.CustomerException;

public class ValidationRules {

	public static void validateEmail(String email, PreparedStatement allCustomerStatement) throws CustomerException, SQLException {
		try(ResultSet rSet = allCustomerStatement.executeQuery()){
		while(rSet.next())
		if (rSet.getString(4).equals(email))
			throw new CustomerException("Email already exists");
		}
		if (!email.matches("[a-z]+[a-z0-9]+@[a-z]*\\.(com|org|net)"))
			throw new CustomerException("Email Invalid");
	}

	public static String validatePass(String pass) {
		if (!pass.matches("^((?=\\S*?[A-Z])(?=\\S*?[a-z])(?=\\S*?[0-9]).{6,})\\S$")) {
			throw new CustomerException(
					"Password Invaid, Passsword must contain 1 atleast Uppercase letter, 1 Lowercase Letter, 1 symbol and at least 1 number");
		}
		return pass;
	}

	public static PlanType validatePlan(String plan) throws RuntimeException {
		return PlanType.valueOf(plan.toUpperCase());
	}

	public static void validateRegistrationAmount(PlanType plan, double registrationAmount) throws CustomerException {
		if (plan.getCharges() > registrationAmount) {
			throw new CustomerException("Registration ammount is " + plan.getCharges() + " for " + plan + " plan ");
		}
	}
}