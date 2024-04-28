package core;

import java.time.LocalDate;
import java.util.Map;

import core.exception.StocksException;

public class ValidationRules {

	public static void validateStockID(String stockID, Map<String, Stock> stocks) {
		if (stocks.containsKey(stockID))
			throw new StocksException("Stock already available....!!!\n");
	}

	public static LocalDate validateClosingDate(String date) {
		LocalDate closingDate = LocalDate.parse(date);
		if (closingDate.isBefore(LocalDate.now()))
			throw new StocksException("Invalid Closing date, cannot be before today...!!!\n");
		return closingDate;
	}

}
