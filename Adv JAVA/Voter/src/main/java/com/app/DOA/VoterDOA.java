package com.app.DOA;

import java.sql.SQLException;

import com.app.core.Voter;

public interface VoterDOA {

	//Get Voter from Database
	Voter login(String email, String password) throws SQLException;
	
	//Add Voter
	boolean voterRegistration(Voter voter ) throws SQLException;
	
	//Change Voter status
	void voted(String email, String password) throws SQLException;
}
