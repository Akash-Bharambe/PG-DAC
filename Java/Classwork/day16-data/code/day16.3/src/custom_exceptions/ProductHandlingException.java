package custom_exceptions;

@SuppressWarnings("serial")
public class ProductHandlingException extends Exception {

	public ProductHandlingException(String message) {
		super(message);
	}

}
