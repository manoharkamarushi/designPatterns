package com.PhoneBuilder;

public class Phone {

	private String os;
	private int phonePrice;
	private int ramSize;
	private double ScreenSize;
	private double battery;

	public Phone(String os, int phonePrize, int ramSize, double Screensize,
			int battery) {

		this.os = os;
		this.phonePrice = phonePrize;
		this.ramSize = ramSize;
		this.ScreenSize = Screensize;
		this.battery = battery;
	}

	public String toString() {

		return "Phone [Os=" + os + ", PhonePrize=" + phonePrice + ", RamSize="
		+ ramSize + ", ScreenSize=" + ScreenSize+ ",Battery="+ battery + "]";
	}
}
