package utils;
/*
 * DB utility class for opening DB conn
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	public static Connection openConnection() throws/* ClassNotFoundException, */ SQLException {
//1. load JDBC driver class 
//		Class.forName("com.mysql.cj.jdbc.Driver"); OPTIONAL 
		String dbURL = "jdbc:mysql://localhost:3306/acts_2024";
		return DriverManager.getConnection(dbURL, "root", "root");
	}
}
