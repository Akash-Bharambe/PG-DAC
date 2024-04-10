package com.vehicle.exception;

@SuppressWarnings("serial")
public class SpeedOutOfBoundsException extends RuntimeException {
	
	public SpeedOutOfBoundsException(String msg) {
		super(msg);
	}
}
