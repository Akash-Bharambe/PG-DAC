package core.exception;

/**
 * Exception class for stock-related errors.
 */
public class StocksException extends RuntimeException {

    /**
     * Constructs a new StocksException with the specified detail message.
     * 
     * @param message The detail message (which is saved for later retrieval by the getMessage() method).
     */
    public StocksException(String message) {
        super(message);
    }

    /**
     * Serial version UID for serialization.
     */
    private static final long serialVersionUID = 4714713184779017156L;

}
