package com.app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	private static Connection connection = null;
//	private static final String URL = "jdbc:mysql://localhost:3306/voter";
//	private static final String USER_NAME = "root";
//	private static final String PASSWORD = "root";

	public static void openConnection(String url, String uname, String password) throws SQLException {
		connection = DriverManager.getConnection(url, uname, password);
	}
	
	public static Connection getConnection() throws SQLException {
		return connection;
	}

	public static void closeConnection() throws SQLException {
		if (connection != null)
			connection.close();
		System.out.println("Connection Closed Successfully...!!!");
	}
}
