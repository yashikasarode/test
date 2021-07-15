package com.innerbeans;

public class Address {
	private int h_no;
	private String street;
	private String city;
	public int getH_no() {
		return h_no;
	}
	public void setH_no(int h_no) {
		this.h_no = h_no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [h_no=" + h_no + ", street=" + street + ", city=" + city + "]";
	}

}
