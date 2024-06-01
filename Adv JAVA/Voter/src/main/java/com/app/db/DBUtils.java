package com.app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	private static Connection connection = null;
	private static final String URL = "jdbc:mysql://localhost:3306/voter";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "root";

	public static Connection openConnection() throws SQLException {
		System.out.println("Connected to Database...!!!");
		connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		return connection;
	}

	public static void closeConnection() throws SQLException {
		if (connection != null)
			connection.close();
		System.out.println("Connection Closed Successfully...!!!");
	}
}
