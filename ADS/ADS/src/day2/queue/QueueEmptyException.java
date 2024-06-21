package day2.queue;

public class QueueEmptyException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public QueueEmptyException(String message) {
		super(message);
	}
}
