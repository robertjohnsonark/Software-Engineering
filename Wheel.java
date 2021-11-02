package edu.uark.models.api;

public class Wheel {
	private String make;
	public String getMake() {
		return this.make;
	}
	public Wheel setMake(String make) {
		this.make = make;
		return this;
	}
	
	private String model;
	public String getModel() {
		return this.model;
	}
	public Wheel setModel(String model) {
		this.model = model;
		return this;
	}
	
	private int width;
	public int getWidth() {
		return this.width;
	}
	public Wheel setWidth(int width) {
		this.width = width;
		return this;
	}
	
	public Wheel() {
		this.width = 0;
		this.make = "";
		this.model = "";
	}
}
