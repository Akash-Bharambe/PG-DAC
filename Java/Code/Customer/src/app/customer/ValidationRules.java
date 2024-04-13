package app.customer;

import java.time.LocalDate;
import java.util.List;

import app.exception.CustomerException;

public class ValidationRules {

	public static Customer ValidateCustomer(String fName, String lName, String email, String pass,
			double registrationAmmount, String dob, String plan, List<Customer> list) throws RuntimeException {
		PlanType planType = validatePlan(plan);
		validateRegistrationAmount(planType, registrationAmmount);

		return new Customer(fName, lName, email, pass, registrationAmmount, LocalDate.parse(dob), planType);
	}

	public static void validateEmail(String email, List<Customer> list) throws CustomerException {
		Customer customer=new Customer(email);
		if (list.contains(customer)) {
			throw new CustomerException("Email already exists");
		}
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