package com.cooksonkd.ootestapplication;
import com.cooksonkd.ootestapplication.Shape;

public class Rectangle extends Shape {
	public double width;
	public double height;
	
	/**
	 * default constructor
	 * initializes instance variables width and height
	 */
	public Rectangle() {
		width = 0;
		height = 0;
	}
	
	/**
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
	
	public String toString() {
		String string = "The width of rectangle is: " + width + "\nThe height of rectangle is: " + height;
		return string;
	}
	
}