package app.exception;

@SuppressWarnings("serial")
public class CustomerException extends RuntimeException{
	public CustomerException(String msg) {
		super(msg);
	}
}
