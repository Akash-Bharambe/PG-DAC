package com.vehicle.exception;

@SuppressWarnings("serial")
public class LicenseExpiredException extends RuntimeException {
	
	public LicenseExpiredException(String msg) {
		super(msg);
	}
}
