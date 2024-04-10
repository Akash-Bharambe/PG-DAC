package com.vehicle.exception;

@SuppressWarnings("serial")
public class FuelUnsupportedException extends RuntimeException {

	public FuelUnsupportedException(String msg) {
		super(msg);
	}
}
