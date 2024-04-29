package com.validations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Map;

import com.core.Contact;
import com.core.exceptions.DOBFormatException;
import com.core.exceptions.DuplicateContactException;
import com.core.exceptions.InvalidDobException;

public class ValidationRules {

	private static LocalDate validateDOB(String dob, Map<String, Contact> map) {
		LocalDate dobDate;
		try {
			dobDate = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			if (dobDate.isAfter(LocalDate.now())) {
				throw new DOBFormatException("Date of Birth cannot be after today...!!!\n");
			}
		} catch (DateTimeParseException e) {
			throw new InvalidDobException("Date of Birth should be of Format dd-MM-yyyy...!!!\n");
		}
		return dobDate;
	}

	public static LocalDate validateNameAndDOB(String name, String dob, Map<String, Contact> map) {
		LocalDate dobDate = validateDOB(dob, map);
		if (map.containsValue(new Contact(name, dobDate))) {
			throw new DuplicateContactException("Contact with name "+name+" already ");
		}
		return dobDate;
	}

}
