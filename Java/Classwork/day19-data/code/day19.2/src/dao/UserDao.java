package dao;

import java.sql.SQLException;

import pojos.User;

public interface UserDao {
//add a method for user signin
	User authenticateUser(String email, String pwd) throws SQLException;
}
