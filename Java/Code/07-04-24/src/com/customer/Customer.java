package com.customer;

public class Customer {
	private int id;
	private String nameString;
	private String address;
	private static int count = 1;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public Customer(String nameString, String address) {
		super();
		this.id = count;
		count++;
		this.nameString = nameString;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + " \tnameString=" + nameString + " \taddress=" + address + "]";
	}


	
}
