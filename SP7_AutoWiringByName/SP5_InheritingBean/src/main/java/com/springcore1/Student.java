package com.springcore1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student 
{
	private int id;
	private String name;
	private Address add;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Constructor with TWO Args
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// Constructor with THREE Args
	public Student(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + "]";
	}

}

