package com.ticket.exception_handler;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ticket.dto.APIResponse;
import com.ticket.ecxeptions.TicketNotFoundException;

// Global Exception Handling Class with Exception Handling methods
@RestControllerAdvice
public class GlobalExceptionHandler {

	// Global Exception Handling method for Invalid Method arguments
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
		List<FieldError> fieldErrors = exception.getFieldErrors();
		Map<String, String> mapfieldErrors = fieldErrors.stream()
				.collect(Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage));
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mapfieldErrors);
	}

	// Global Exception Handler Method for Ticket Not Found
	@ExceptionHandler(TicketNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public APIResponse handleTicketNotFoundException(TicketNotFoundException exception) {
		return new APIResponse(exception.getMessage());
	}
	
	// 	Global Exception Handler Method for Internal Server Errors
	@ExceptionHandler(RuntimeException.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public APIResponse handleRuntimeException(RuntimeException exception) {
		return new APIResponse(exception.getMessage());
	}

}
