package com.vehicle.exception;

import java.time.LocalDate;

public class ValidationRules {

	public static final int MAX_SPEED;
	public static final int MIN_SPEED;

	static {
		MAX_SPEED = 100;
		MIN_SPEED = 40;
	}

	public static void validateSpeed(int speed) throws SpeedOutOfBoundsException {
		if (speed > MAX_SPEED)
			throw new SpeedOutOfBoundsException("Please slow down, you may run over someone...!!!");
		if (speed < MIN_SPEED)
			throw new SpeedOutOfBoundsException("You are causing traffic, Please Speed Up...!!!");
		System.out.println("Speed Within Range....");
	}

	public static void validateFuel(String fuel) throws FuelUnsupportedException {
		boolean found = false;
		for (FuelType ft : FuelType.values()) {
			if (ft.toString().equals(fuel)) {
				found = true;
				break;
			}
		}
		if (!found) {
			throw new FuelUnsupportedException(
					"Please visit some other fuel Station, Your Specified Fuel is Not Available Here...");

		}
		System.out.println("Fuel is Available");

	}

	public static void validateDate(LocalDate when) {
		if (when.isBefore(LocalDate.now())) {
			throw new LicenseExpiredException("Please renew your License...");
		}
		System.out.println("License is Valid");
	}

}
