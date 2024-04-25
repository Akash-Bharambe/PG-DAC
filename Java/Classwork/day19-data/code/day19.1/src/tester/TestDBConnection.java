package tester;

import static utils.DBUtils.openConnection;

import java.sql.Connection;

public class TestDBConnection {

	public static void main(String[] args) {
		try (Connection cn = openConnection()) {
			System.out.println("DB cn established ! "+cn);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
