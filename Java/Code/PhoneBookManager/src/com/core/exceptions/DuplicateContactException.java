package com.core.exceptions;

public class DuplicateContactException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6308229786397314603L;

	public DuplicateContactException(String message) {
		super(message);
	}

}
