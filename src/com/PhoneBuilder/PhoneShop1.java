package com.PhoneBuilder;

public class PhoneShop1 {

	public static void main(String a[]) {

		Phone1 ph=new PhoneBuilder1().setOs("Android").getPhone();
		System.out.println(ph);
	}

}
