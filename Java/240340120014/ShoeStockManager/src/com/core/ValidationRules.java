package com.core;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Map;
import java.util.Random;

import com.core.exceptions.InvalidCategoryException;
import com.core.exceptions.InvalidDateException;
import com.core.exceptions.InvalidPriceExeption;

public class ValidationRules {

	/**
	 * Method to Validate Category of a Shoe if it exixts or not
	 * 
	 * @param categoryString 
	 * @return
	 * @throws InvalidCategoryException
	 */
	public static CategoryType validateCategory(String categoryString) throws InvalidCategoryException {
		try {
			CategoryType category = CategoryType.valueOf(categoryString.toUpperCase());
			return category;
		} catch (IllegalArgumentException e) {
			throw new InvalidCategoryException("Invalid Category, please enter a valid category of shoes...!!!\n");
		}
	}

	public static LocalDate validateDate(String dateString) throws InvalidDateException {
		try {
			LocalDate localDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			return localDate;
		} catch (DateTimeParseException e) {
			throw new InvalidDateException("Please enter a valid date in format dd-MM-yyyy...!!!\n");
		}
	}

	public static void validateprice(double price) throws InvalidPriceExeption {
		if (price < 0) {
			throw new InvalidPriceExeption("Price Shold be Greater than 0...!!!\n");
		}
	}

	public static int getStockID(Map<Integer, Shoe> shoeMap) {
		Random random = new Random();
		int ID = random.nextInt(9000) + 1000;

		while (shoeMap.containsKey(ID)) {
			ID = random.nextInt();
		}
		return ID;
	}

}
