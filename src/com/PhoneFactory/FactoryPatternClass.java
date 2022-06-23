package com.PhoneFactory;

public class FactoryPatternClass {

	public OS getOS(String str) {

		if (str == "Open") {

			return new Android();
		} else if (str == "closed") {

			return new IOS();
		} else if (str == "dummy") {

			return new Windows();
		} else if (str == "Old"){
			
			System.out.println("not yet defined");
			return null;
		}

			return null;
	}
}
