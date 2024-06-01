package com.app.DOA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import com.app.core.Voter;
import com.app.db.DBUtils;

public class VoterDOAImpl implements VoterDOA {

	private Connection connection;
	private PreparedStatement pstLogin;
	private PreparedStatement pstVoted;
	private PreparedStatement pstVoterRegistration;

	public VoterDOAImpl() throws SQLException {
		this.connection = DBUtils.openConnection();
		this.pstLogin = connection.prepareStatement("select * from voters where email=? and password=?");
		this.pstVoted = connection.prepareStatement("update voter set status=true where email=? and password=?");
		this.pstVoterRegistration = connection.prepareStatement("insert into voters (first_name, last_name, email, password, dob, status, role) values(?,?,?,?,?,?,?)");
	}

	@Override
	public Voter login(String email, String password) throws SQLException {
		pstLogin.setString(1, email);
		pstLogin.setString(2, password);
		try (ResultSet resultSet = pstLogin.executeQuery()) {
			return new Voter(resultSet.getString("first_name"), resultSet.getString("last_name"),
					resultSet.getString("email"), resultSet.getString("password"),
					LocalDate.parse(resultSet.getString("dob")), resultSet.getBoolean("status"),
					resultSet.getString("role"));
		}
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
			pstVoterRegistration.setBoolean(6, false);
			pstVoterRegistration.setString(7, "voter");
			int affectedRows = pstVoterRegistration.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
