package dao;

import java.sql.*;

import pojos.User;
import static utils.DBUtils.*;

public class UserDaoImpl implements UserDao {
	// state
	private Connection cn;
	private PreparedStatement pst1;

	// def ctor
	public UserDaoImpl() throws SQLException {
		// get db cn
		cn = openConnection();
		// pst : login query
		pst1 = cn.prepareStatement("select * from users where email=? and password=?");
		System.out.println("user dao created....");
	}

	@Override
	public User authenticateUser(String email, String pwd) throws SQLException {
		//1. set IN params
		pst1.setString(1, email);
		pst1.setString(2, pwd);
		//exec query --select
		try(ResultSet rst=pst1.executeQuery()) {
			if(rst.next())
				/*
				 * int userId, String firstName, String lastName, String email, 
				 * String password, double regAmount,
			Date regDate, String role
				 */
				return new User(rst.getInt(1),rst.getString(2),rst.getString(3),
						email,pwd,rst.getDouble(6),rst.getDate(7),rst.getString(8));
		}
		return null;
	}
	
	//clean up -- closing of DB resources
	public void cleanUp() throws SQLException
	{
		if(pst1 != null)
			pst1.close();
		if(cn != null)
			cn.close();
		System.out.println("user dao cleaned up !");
	}

}
