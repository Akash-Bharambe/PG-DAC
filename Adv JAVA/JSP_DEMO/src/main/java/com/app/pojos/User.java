package com.app.pojos;

public class User {
	private int id;
	private String name;
	private String uname;
	private String pass;
	public User(int id, String name, String uname, String pass) {
		super();
		this.id = id;
		this.name = name;
		this.uname = uname;
		this.pass = pass;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", uname=" + uname + ", pass=" + pass + "]";
	}
	
	
}
