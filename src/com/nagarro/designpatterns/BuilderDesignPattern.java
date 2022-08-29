package com.nagarro.designpatterns;

class Phone {
	private String os;
	private String processor;
	private int ram;
	private double screenSize;
	private int battery;

	/**
	 * @param os
	 * @param processor
	 * @param ram
	 * @param screenSize
	 * @param battery
	 */
	public Phone(String os, String processor, int ram, double screenSize, int battery) {
		super();
		this.os = os;
		this.processor = processor;
		this.ram = ram;
		this.screenSize = screenSize;
		this.battery = battery;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Phone[os : " + this.os + ", ram = " + this.ram + "processor =" + this.processor + "screenSize = "
				+ this.screenSize + " battery = " + this.battery + "]";
	}

}

class PhoneBuilder{
	
	private String os;
	private String processor;
	private int ram;
	private double screenSize;
	private int battery;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}

	public Phone getPhone() {
		return new Phone(os, processor, ram, screenSize, battery);
	}
}

public class BuilderDesignPattern {

	public static void main(String[] args) {

		Phone p = new PhoneBuilder().setBattery(2000).setRam(2).getPhone();
		System.out.println(p);
		
	}

}
