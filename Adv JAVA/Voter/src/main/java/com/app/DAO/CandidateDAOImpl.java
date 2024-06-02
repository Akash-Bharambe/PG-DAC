package com.app.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.app.core.Candidate;
import com.app.db.DBUtils;

public class CandidateDAOImpl implements CandidateDAO {

	private Connection connection;
	private PreparedStatement pstCandidateList;
	private PreparedStatement pstaddVote;

	public CandidateDAOImpl() throws SQLException {
		this.connection = DBUtils.getConnection();
		this.pstCandidateList = connection.prepareStatement("select * from candidates");
		this.pstaddVote = connection.prepareStatement("update candidates set votes=? where id=?");
	}

	@Override
	public Map<Integer, Candidate> getAllCandidates() {
		Map<Integer, Candidate> candidates = new HashMap<Integer, Candidate>();
		try (ResultSet resultSet = pstCandidateList.executeQuery()) {
			while (!resultSet.isLast()) {
				if (resultSet.next()) {
					Candidate candidate = new Candidate(resultSet.getInt("id"), resultSet.getString("name"),
							resultSet.getString("party"), resultSet.getInt("votes"));
					candidates.put(candidate.getId(), candidate);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		;
		return candidates;
	}

	@Override
	public void addVote(int id) throws SQLException {
		System.out.println(id);
		Map<Integer, Candidate> candidates = getAllCandidates();
		System.out.println(candidates);
		Candidate candidate = candidates.get(id);
		pstaddVote.setInt(1, candidate.getVotes()+1);
		pstaddVote.setInt(2, id);
		pstaddVote.executeUpdate();
		
	}

}
