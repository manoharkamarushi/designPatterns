package com.AdapterStructuralPattern;

import com.ManoharPenAdapter.PilotPen;

public class PenAdapter implements Pen{

	PilotPen pp=new PilotPen();
	
	@Override
	public void write(String s) {
		
		pp.mark(s);
	}
	
	

}
