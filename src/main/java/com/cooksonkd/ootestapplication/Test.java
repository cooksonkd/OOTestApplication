package com.cooksonkd.ootestapplication;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		//create instance of ShapeManager
		ShapeManager sm = new ShapeManager();
		
		//create two shapes of types Circle and Rectangle respectively
		Shape circle = new Circle(20);		
		Shape rectangle = new Rectangle(25, 15);
		
		shapes.add(circle);
		shapes.add(rectangle);
		
		sm.render(shapes);
		sm.area(circle);
		sm.area(rectangle);
		
	}

}
