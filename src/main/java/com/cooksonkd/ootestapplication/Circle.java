package com.cooksonkd.ootestapplication;
import com.cooksonkd.ootestapplication.Shape;

public class Circle extends Shape{
	public double radius;
	
	public static Circle create(double radius) {
		Circle circle = new Circle();
		circle.radius = radius; 
		return circle;
	}
	
}
