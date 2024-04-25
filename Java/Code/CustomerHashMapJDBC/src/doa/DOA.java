package doa;

import java.sql.SQLException;

import app.customer.Customer;
import app.exception.CustomerException;

public interface DOA {
	public void closeConnection() throws SQLException;

	void addCustomer() throws CustomerException, SQLException;

	Customer authenticateCustomer(String email, String pass) throws SQLException;
}
