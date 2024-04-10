package utils;

import custom_exceptions.SpeedOutOfRangeException;

/*
 * Will contain different method for validation rules
 */
public class VehicleValidationRules {
	// add speed limits as constants
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	static {
		// init static data members
		MIN_SPEED = 40;
		MAX_SPEED = 80;
	}

//add public static (since it's not using any instance vars) 
	// method to validate speed
	// can satisfy the javac : using try-catch OR throws
	// using throws : to use centralized exc handling
	public static void validateSpeed(int speed) 
			throws SpeedOutOfRangeException {
		if (speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("Speed too low !!!!");
		if (speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("Speed too high , FATAL !!!!");
		System.out.println("speed within range...");
	}
}
