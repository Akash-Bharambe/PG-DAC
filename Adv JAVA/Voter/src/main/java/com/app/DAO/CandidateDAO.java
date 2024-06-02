package com.app.DAO;

import com.app.core.Candidate;

public interface CandidateDAO {
	Candidate getAllCandidates();
	void addVote();
}
