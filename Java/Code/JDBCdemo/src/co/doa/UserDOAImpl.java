package co.doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import core.User;

public class UserDOAImpl implements UserDOA {
	private Connection cn;
	private PreparedStatement pStatement;

	public UserDOAImpl() {
		try {
			cn = openConnection();
			pStatement = cn.prepareStatement("select * from user where email = ? and password = ?");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public User authenticateUser(String email, String pass) throws SQLException {
		pStatement.setString(1, email);
		pStatement.setString(2, pass);

		try (ResultSet rstResultSet = pStatement.executeQuery()) {
			if (rstResultSet.next()) {
//				System.out.println("id: " + rstResultSet.getInt(1) + " Name: " + rstResultSet.getString(2) + " "
//						+ rstResultSet.getString(3) + " Email: " + rstResultSet.getString(4) + " Registration Amount: "
//						+ rstResultSet.getDouble(6) + " Registration Date: " + rstResultSet.getDate(7) + " Role: "
//						+ rstResultSet.getString(8));
				return new User(rstResultSet.getInt(1), rstResultSet.getString(2), rstResultSet.getString(3),
						rstResultSet.getString(4), rstResultSet.getDouble(6), rstResultSet.getDate(7),
						rstResultSet.getString(8));
			}
		}
		return null;
	}

	public Connection openConnection() throws SQLException {
		return DriverManager.getConnection("jdbc.mysql://localhost:3306/JDBC");
	}

	@Override
	public void closeConnection() throws SQLException {
		if (pStatement != null)
			pStatement.close();
		if (cn != null)
			cn.close();
	}
}
