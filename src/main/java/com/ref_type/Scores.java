package com.ref_type;

public class Scores {
	private double phy;

	private double chem;
	private double maths;
	
	public double getPhy() {
		return phy;
	}
	public void setPhy(double phy) {
		this.phy = phy;
	}
	public double getChem() {
		return chem;
	}
	public void setChem(double chem) {
		this.chem = chem;
	}
	public double getMaths() {
		return maths;
	}
	public void setMaths(double maths) {
		this.maths = maths;
	}
	
	@Override
	public String toString() {
		return "Scores [phy=" + phy + ", chem=" + chem + ", maths=" + maths + "]";
	}

}
