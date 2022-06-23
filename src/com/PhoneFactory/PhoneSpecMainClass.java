package com.PhoneFactory;

public class PhoneSpecMainClass {

	public static void main(String[] args) {

		/*
		 * OS obj=new Android();
			obj.specs();
		*/
		
		// till here fine, acheiving loose coupling. but we are exposing the logic to the client that
		// android specs object created bla bla 
		//Now
		
		FactoryPatternClass fpc=new FactoryPatternClass();
		OS obj=fpc.getOS("Open");
		obj.specs();
	
	}

}
