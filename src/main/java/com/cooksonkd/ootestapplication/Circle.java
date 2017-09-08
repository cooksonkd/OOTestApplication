package com.cooksonkd.ootestapplication;
import com.cooksonkd.ootestapplication.Shape;

/**
 * @author Keenan Cookson
 *
 */
public class Circle extends Shape{
	public double radius;
	private double area;
	
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
	
	/**
	 * @return the area of the circle
	 */
	public double area() {
		area = Math.PI * radius * radius;
		return area;
	}
	
	/**
	 * @param radius
	 * sets the radius for the circle
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * @return a string that contains the radius and area of the circle
	 */
	public String toString() {
		String string = "The radius of the circle is: " + radius + "\nThe Area of the circle is: " + area + "\n\n";
		return string;
	}
	
}
