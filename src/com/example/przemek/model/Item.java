package com.example.przemek.model;

public class Item {
	
	private String name;
	private int weight;
	private int value;
	private int amount;
	private double valueRatio;
	private int taken = 0;

	public void SetName (String name) {
		this.name = name;
	}
	
	public String GetName () {
		return this.name;
	}
	
	public void SetWeight (int weight) {
		this.weight = weight;
	}
	
	public int GetWeight () {
		return this.weight;
	}
	
	public void SetValue (int value) {
		this.value = value;
	}
	
	public int GetValue () {
		return this.value;
	}
	
	public void SetAmount (int amount) {
		this.amount = amount;
	}
	
	public int GetAmount () {
		return this.amount;
	}
	
	public void makeValueRatio () {
		if (this.value == 0 || this.weight == 0) {
			this.valueRatio = 0;
		} 
		else {
		this.valueRatio = this.value/this.weight;
		}
	}
	
	public double getValueRatio () {
		return this.valueRatio;
	}
	
	public int GetTaken () {
		return this.taken;
	}
	
	public void increaseTaken () {
		this.taken = this.taken + 1;
	}
}
