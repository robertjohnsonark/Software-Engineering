package edu.uark.models.api;

public class Car {
	private String make;
	public String getMake() {
		return this.make;
	}
	public Car setMake(String make) {
		this.make = make;
		return this;
	}
	
	private String model;
	public String getModel() {
		return this.model;
	}
	public Car setModel(String model) {
		this.model = model;
		return this;
	}
	
	private Wheel[] wheels;
	public Wheel[] getWheels() {
		return this.wheels;
	}
	public Car setWheels(Wheel[] wheels) {
		this.wheels = wheels;
		return this;
	}
	
	public Car() {
		this.make = "";
		this.model = "";
		this.wheels = new Wheel[0];
	}
}
