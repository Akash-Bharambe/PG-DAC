package com.app.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import com.app.core.Voter;
import com.app.db.DBUtils;

public class VoterDAOImpl implements VoterDAO {

	private Connection connection;
	private PreparedStatement pstLogin;
	private PreparedStatement pstVoted;
	private PreparedStatement pstVoterRegistration;

	public VoterDAOImpl() throws SQLException {
		this.connection = DBUtils.getConnection();
		this.pstLogin = connection.prepareStatement("select * from voters where email = ? and password = ?");
		this.pstVoted = connection.prepareStatement("update voters set status=true where email=? and password=?");
		this.pstVoterRegistration = connection.prepareStatement(
				"insert into voters (first_name, last_name, email, password, dob, status, role) values(?,?,?,?,?,?,?)");
	}

	@Override
	public Voter login(String email, String password) throws SQLException {
		pstLogin.setString(1, email);
		pstLogin.setString(2, password);
		System.out.println(email);
		System.out.println(password);
		try (ResultSet resultSet = pstLogin.executeQuery()) {
			if (resultSet.next())
				return new Voter(resultSet.getString("first_name"), resultSet.getString("last_name"),
						resultSet.getString("email"), resultSet.getString("password"),
						LocalDate.parse(resultSet.getString("dob")), resultSet.getBoolean("status"),
						resultSet.getString("role"));
		}
		return null;
	}

	@Override
	public void voted(String email, String password) {
		try {
			pstVoted.setString(1, email);
			pstVoted.setString(2, password);
			int affectedRows = pstVoted.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean voterRegistration(Voter voter) {
		try {
			pstVoterRegistration.setString(1, voter.getFirst_name());
			pstVoterRegistration.setString(2, voter.getLast_name());
			pstVoterRegistration.setString(3, voter.getEmail());
			pstVoterRegistration.setString(4, voter.getPassword());
			pstVoterRegistration.setString(5, voter.getDob().toString());
			pstVoterRegistration.setBoolean(6, voter.isStatus());
			pstVoterRegistration.setString(7, voter.getRole());
			int affectedRows = pstVoterRegistration.executeUpdate();
			if (affectedRows > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void cleanUp() throws SQLException {
		if (connection != null)
			connection.close();
	}

}
