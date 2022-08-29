package com.nagarro.miscelleneous;

class Guitar {

	private String make;
	private String model;
	private int volume;

	/**
	 * @param make
	 * @param model
	 * @param volume
	 */
	public Guitar(String make, String model, int volume) {
		super();
		this.make = make;
		this.model = model;
		this.volume = volume;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}

class SuperCoolGuitarWithFlames extends Guitar {

	private String flameColor;

	public SuperCoolGuitarWithFlames(String make, String model, int volume, String flameColor) {
		super(make, model, volume);
		this.flameColor = flameColor;
	}

	public String getFlameColor() {
		return flameColor;
	}

	public void setFlameColor(String flameColor) {
		this.flameColor = flameColor;
	}

}

public class OpenClosePrinciple {

	public static void main(String[] args) {

	}
}
