package app;

public interface ValidationRules {
	public static void validateRating(int rating) {
		if (rating < 0 || rating > 10) throw new CricketerException("Invalid Rating, must be between 0 to 10");
	}
}
