package core;

import java.sql.Date;

public class User {
	private int id;
	private String fName;
	private String lName;
	private String email;
	private String pass;
	private double regAmt;
	private Date regDate;
	private String role;
	
	
	public User() {
	}


	public User(int id, String fName, String lName, String email, double regAmt, Date regDate, String role) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.regAmt = regAmt;
		this.regDate = regDate;
		this.role = role;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", pass=" + pass
				+ ", regAmt=" + regAmt + ", regDate=" + regDate + ", role=" + role + "]";
	}
	
	
}
