package com.lifecycle.xmlconfig;

public class Patient {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("setter called");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void init() {
		System.out.println("hello init");
	}
	public void destroy() {
		System.out.println("Destroyed");
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + "]";
	}

}
