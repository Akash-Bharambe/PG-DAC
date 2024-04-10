package com.vehicle.exception;

public enum FuelType {
	PETROL, DIESEL, CNG, EV;
	public String toString() {
		return name().toLowerCase();
	}
}
