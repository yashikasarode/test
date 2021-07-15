package com.DependencyCheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {
	int id;
	String pname;
	List<String> medicine;
	public int getId() {
		return id;
	}
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public List<String> getMedicine() {
		return medicine;
	}
	public void setMedicine(List<String> medicine) {
		this.medicine = medicine;
	}
	@Override
	public String toString() {
		return "Prescription [id=" + id + ", pname=" + pname + ", medicine=" + medicine + "]";
	}
	
	 
	

}
