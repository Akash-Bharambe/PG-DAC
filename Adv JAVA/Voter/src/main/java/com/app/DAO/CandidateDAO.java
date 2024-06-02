package com.app.DAO;

import java.sql.SQLException;
import java.util.Map;

import com.app.core.Candidate;

public interface CandidateDAO {
	Map<Integer, Candidate> getAllCandidates();
	void addVote(int id) throws SQLException;
}
