package tester;

/*
 * display all user details
 */
import java.sql.*;
import static utils.DBUtils.openConnection;

public class TestStatement {

	public static void main(String[] args) {
		try (// 1. cn
				Connection cn = openConnection();
				// 2. ST
				Statement st = cn.createStatement();
				// 3. exec query : select
				ResultSet rst = st.executeQuery("select * from users");) {
			while (rst.next())
				System.out.println("id " 
			+ rst.getInt(1) + " first name " + rst.getString(2));

		} //JVM : rst.close , st.close , cn.close
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
