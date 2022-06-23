package com.AdapterStructuralPattern;

public class Assignment {

	// private String pen; dont declare like this, we can implement the method
	// in pen interface.

	private Pen p;

	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}

	public void writeAssignment(String s) {
		p.write(s);
	}
}
