package tester;

/*
 * display all user details
 */
import java.sql.*;
import java.util.Scanner;

import static utils.DBUtils.openConnection;

public class TestPreparedStmt {

	public static void main(String[] args) {
		try (
				// 0. sc
				Scanner sc = new Scanner(System.in);
				// 1. cn
				Connection cn = openConnection();
				// 2. PST
				PreparedStatement pst = cn.prepareStatement("select * from users where email=? and password=?");) {

			System.out.println("Enter email n password");
			// set IN params
			pst.setString(1, sc.next());// set email
			pst.setString(2, sc.next());// set pwd
			// exec query : select query -- public RST executeQuery() throws SQLException
			try (ResultSet rst = pst.executeQuery()) {
				if (rst.next()) {
					System.out.println("Login Success , Hello ,  " + rst.getString(2) + " " + rst.getString(3));
					System.out.println("Currently logged in under role : " + rst.getString(8));
				} else
					System.out.println("Invalid email or pwd!!!!!!!!!!");
			}// JVM : rst.close()

		} // JVM :  pst.close , cn.close , sc.close
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
