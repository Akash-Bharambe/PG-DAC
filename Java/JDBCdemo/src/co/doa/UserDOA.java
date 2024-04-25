package co.doa;
import java.sql.*;

import core.User;
public interface UserDOA {
	public Connection openConnection() throws SQLException;
	public void closeConnection() throws SQLException;
	public User authenticateUser(String email, String pass) throws SQLException;
}