package br.com.web.Locadora.Model;

public class Car {
	
	//MARK:- Properties
	private String name;
	private String mark;
	private double price;
	
	public Car(String name, String mark, double d) {
		this.name = name;
		this.mark = mark;
		this.price = d;
	}
	
	//MARK:- Methods
	public String getMark() {
		return mark;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
}
