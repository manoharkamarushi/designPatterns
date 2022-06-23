package com.PhoneBuilder;

public class Phone1 {

	private String os;
	private int phonePrice;
	private int ramSize;
	private double ScreenSize;
	private double battery;

	public Phone1(String os, int phonePrice, int ramSize, double screenSize,
			double battery) {
		super();
		this.os = os;
		this.phonePrice = phonePrice;
		this.ramSize = ramSize;
		this.ScreenSize = screenSize;
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Phone1 [os=" + os + ", phonePrice=" + phonePrice + ", ramSize="
				+ ramSize + ", ScreenSize=" + ScreenSize + ", battery="
				+ battery + "]";
	}

}
