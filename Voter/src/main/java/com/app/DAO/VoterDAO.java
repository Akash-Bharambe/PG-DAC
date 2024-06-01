package com.app.DAO;

import java.sql.SQLException;

import com.app.core.Voter;

public interface VoterDAO {

	//Get Voter from Database
	Voter login(String email, String password) throws SQLException;
	
	//Add Voter
	boolean voterRegistration(Voter voter ) throws SQLException;
	
	//Change Voter status
	void voted(String email, String password) throws SQLException;
	
	//Clean Up Method
	void cleanUp() throws SQLException;
}
