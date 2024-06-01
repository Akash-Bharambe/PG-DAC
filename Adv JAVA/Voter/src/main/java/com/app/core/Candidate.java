package com.app.core;

public class Candidate {
	private int id;
	private String name;
	private String party;
	private int votes;
	public Candidate(int id, String name, String party, int votes) {
		super();
		this.id = id;
		this.name = name;
		this.party = party;
		this.votes = votes;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getParty() {
		return party;
	}
	@Override
	public String toString() {
		return "Candidate [id=" + id + ", name=" + name + ", party=" + party + ", votes=" + votes + "]";
	}

}
