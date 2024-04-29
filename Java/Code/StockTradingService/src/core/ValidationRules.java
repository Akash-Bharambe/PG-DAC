package core;

import java.time.LocalDate;
import java.util.Map;

import core.exception.StocksException;

/**
 * This class contains validation rules for stocks.
 */
public interface ValidationRules {

    /**
     * Validates if the given stock ID is already present in the provided map of stocks.
     * 
     * @param stockID The ID of the stock to validate.
     * @param stocks A map containing existing stocks, where the keys are stock IDs.
     * @throws StocksException If the stock ID is already present in the map.
     */
    public static void validateStockID(String stockID, Map<String, Stock> stocks) {
        if (stocks.containsKey(stockID))
            throw new StocksException("Stock already available....!!!\n");
    }

    /**
     * Validates the closing date of a stock.
     * 
     * @param date A string representation of the closing date in the format 'yyyy-MM-dd'.
     * @return The validated closing date as a LocalDate object.
     * @throws StocksException If the provided closing date is before the current date.
     */
    public static LocalDate validateClosingDate(String date) {
        LocalDate closingDate = LocalDate.parse(date);
        if (closingDate.isBefore(LocalDate.now()))
            throw new StocksException("Invalid Closing date, cannot be before today...!!!\n");
        return closingDate;
    }

}
