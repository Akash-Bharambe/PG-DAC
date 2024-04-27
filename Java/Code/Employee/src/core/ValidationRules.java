package core;

import java.time.LocalDate;
import java.util.Map;

import core.exception.EmployeeException;

public interface ValidationRules {

	public static void validatePhoneNumber(String phoneNumber) {
		if (!phoneNumber.matches("^[0-9]*$"))
			throw new EmployeeException("Phone Number should be Numeric...!!!/n");
		if (phoneNumber.length() != 10)
			throw new EmployeeException("Phone Number should be 10 digits long...!!!\n");
	}

	public static void validateAadhar(String aadharNumber, Map<String, Employee> empMap) {
		if (!aadharNumber.matches("^\\S+$"))
			throw new EmployeeException("Phone Number should be Numeric...!!!/n");
		if (aadharNumber.length() != 12)
			throw new EmployeeException("Phone Number should be 10 digits long...!!!\n");

		if (empMap.containsKey(aadharNumber))
			throw new EmployeeException("Aadhar Number already exists...!!!\n");
	}

	public static void validateDOJ(String dateOfJoining) {
		if (LocalDate.parse(dateOfJoining).isAfter(LocalDate.now()))
			throw new EmployeeException("Joining date cannot be future date...!!!\n");
	}
}
