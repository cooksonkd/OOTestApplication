package com.cooksonkd.ootestapplication;
import com.cooksonkd.ootestapplication.Shape;

/**
 * Extends the Shape Class and creates an object of type Rectangle
 * @author Keenan Cookson
 */
public class Rectangle extends Shape {
	public double width;
	public double height;
	private double area;
	
	/**
	 * Default constructor;
	 * initializes instance variables width and height
	 */
	public Rectangle() {
		width = 0;
		height = 0;
	}
	
	/**
	 * Parameterised constructor that creates a rectangle object with height and width already set.
	 * @param width
	 * @param height
	 */
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	/**
	 * @param width
	 * @param height
	 * @return an object of type Rectangle
	 */
	public static Rectangle create(double width, double height) {
		Rectangle rectangle = new Rectangle();
		rectangle.width = width;
		rectangle.height = height;
		return rectangle;
	}
	
	/**
	 * sets the width of the rectangle
	 * @param width
	 * 
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	
	/**
	 * sets the height of the rectangle
	 * @param height
	 * 
	 */
	public void setHeight(double height) {
		this.height = height;
		
	}
	
	/**
	 * @return the area of the rectangle
	 */
	public double area() {
		area = width * height;
		return area;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * @return a string that contains the width, height and area of the rectangle
	 */
	public String toString() {
		String string = "The width of the rectangle is: " + width + "\nThe height of the rectangle is: " + height + "\nThe area of the rectangle is: " + area + "\n\n";
		return string;
	}
	
}