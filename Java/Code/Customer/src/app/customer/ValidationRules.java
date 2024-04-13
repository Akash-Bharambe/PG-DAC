package app.customer;

import app.exception.CustomerException;

public class ValidationRules {

	public static void ValidateCustomer(String email, double registrationAmmount,
			String dob, String plan) throws RuntimeException {
		PlanType planType = validatePlan(plan);
		validateRegistrationAmount(planType, registrationAmmount);
	}
	
	public static PlanType validatePlan(String plan) throws RuntimeException{
		return PlanType.valueOf(plan.toUpperCase());
	}
	
	public static void validateRegistrationAmount(PlanType plan,double registrationAmount) throws CustomerException{
			if (plan.getCharges() > registrationAmount ) {
				throw new CustomerException("Registration ammount is " + plan.getCharges() + " for "+ plan + " plan ");
			}
	}
}
