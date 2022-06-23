package com.PhoneBuilder;

public class PhoneBuilder1 {

	private String os;
	private int phonePrice;
	private int ramSize;
	private double ScreenSize;
	private double battery;

	public PhoneBuilder1 setOs(String os) {
		this.os = os;
		return this;
	}

	public PhoneBuilder1 setPhonePrice(int phonePrice) {
		this.phonePrice = phonePrice;
		return this;
	}

	public PhoneBuilder1 setRamSize(int ramSize) {
		this.ramSize = ramSize;
		return this;
	}

	public PhoneBuilder1 setScreenSize(double screenSize) {
		ScreenSize = screenSize;
		return this;
	}

	public PhoneBuilder1 setBattery(double battery) {
		this.battery = battery;
		return this;
	}

	public Phone1 getPhone() {

		return new Phone1(os, phonePrice, ramSize, ScreenSize, battery);
	}
}
