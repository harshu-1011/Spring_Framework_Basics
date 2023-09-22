package com.test4;

public class student {
	int roll;
	String name,address;
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}	

	@Override
	public String toString() {
		return "student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
}
