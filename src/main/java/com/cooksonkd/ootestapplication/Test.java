package com.cooksonkd.ootestapplication;

import java.util.ArrayList;

/**
 * @author Keenan Cookson
 *
 */
public class Test {

	/**
	 * @param args
	 * Main method to run the application
	 */
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
		
		sm.area(circle);
		sm.area(rectangle);
		
		sm.render(shapes);
		
		sm.scale(circle, 0.5);
		sm.scale(rectangle, 0.75);
		
		sm.area(circle);
		sm.area(rectangle);
		
		System.out.print("After scaling: \n\n");
		
		sm.render(shapes);
		
	}

}
