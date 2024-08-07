package com.automobile.exc_handler;

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

import com.automobile.dto.APIResponse;
import com.automobile.exception.VehicleException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
		
		List<FieldError> fieldErrors = e.getFieldErrors();
		
		Map<String,String> map = fieldErrors.stream().collect(Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage));	
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(map);
	}
	
	@ExceptionHandler(VehicleException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public APIResponse handleDoctorException(VehicleException e) {
		return new APIResponse(e.getMessage());
	}
	
	@ExceptionHandler(RuntimeException.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public APIResponse handleRuntimeException(RuntimeException e) {
		return new APIResponse(e.getMessage());
	}
	
}
