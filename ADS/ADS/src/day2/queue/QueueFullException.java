package day2.queue;

public class QueueFullException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public QueueFullException(String message) {
		super(message);
	}

}
