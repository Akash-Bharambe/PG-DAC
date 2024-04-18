package utils;

import java.time.LocalDate;

import exception.WatchException;
import watch.BandMaterialType;
import watch.CategoryType;
import watch.ShapeType;
import watch.StyleType;

public class ValidationRules {

	
	public static CategoryType validateCategory(String shape) throws RuntimeException {
		return CategoryType.valueOf(shape);
	}

	public static ShapeType validateShape(String next) throws RuntimeException {
		return ShapeType.valueOf(next);
	}

	public static StyleType validateStyle(String next) throws RuntimeException {
		return StyleType.valueOf(next);
	}

	public static BandMaterialType validateBandMaterial(String next) throws RuntimeException {
		return BandMaterialType.valueOf(next);
	}

	public static int validateStock(int nextInt) throws RuntimeException {
		if (nextInt > 0) {
			return nextInt;
		}
		throw new WatchException("Stock size must be greater than 0..!!!");
	}

	public static LocalDate validateDate(String next) throws RuntimeException {
		return LocalDate.parse(next);
	}

	public static double validatePrice(double nextDouble) {
		if (nextDouble > 0) {
			return nextDouble;
		}
		throw new WatchException("Watch Price Cannot be less than Zero..!!!");
	}
	
	

}
