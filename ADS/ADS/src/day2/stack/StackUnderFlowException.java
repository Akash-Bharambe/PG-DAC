package day2.stack;

public class StackUnderFlowException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public StackUnderFlowException(String message) {
		super(message);
	}
}
