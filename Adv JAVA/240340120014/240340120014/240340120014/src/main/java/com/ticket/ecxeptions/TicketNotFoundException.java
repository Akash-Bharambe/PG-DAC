package com.ticket.ecxeptions;

// Exception that is thrown when Ticket does not exist
public class TicketNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TicketNotFoundException(String message) {
		super(message);
	}

}
