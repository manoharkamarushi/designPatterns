package com.AdapterStructuralPattern;

public class School {

	public static void main(String[] args) {

//		PilotPen pp=new PilotPen();
//		Assignment a=new Assignment();
//		a.setP(pp); // you cannot pass the pp object here.
//		a.writeAssignment("");
		
		Pen p=new PenAdapter();
		Assignment a =new Assignment();
		a.setP(p);
		a.writeAssignment("My Assignment content");
	}

}
