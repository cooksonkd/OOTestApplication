package com.cooksonkd.ootestapplication;
import com.cooksonkd.ootestapplication.Shape;

public class Circle extends Shape{
	public double radius;
	
	/**
	 * default constructor
	 * initializes instance variable radius
	 */
	public Circle() {
		radius = 0;
	}
	
	/**
	 * @param radius
	 * parameterised constructor accepts value for radius
	 */
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/**
	 * @param radius
	 * @return creates circle object and returns it
	 */
	public static Circle create(double radius) {
		Circle circle = new Circle();
		circle.radius = radius; 
		return circle;
	}
	
	public String toString() {
		String string = "The radius of circle is: " + radius + "\n";
		return string;
	}
	
}
