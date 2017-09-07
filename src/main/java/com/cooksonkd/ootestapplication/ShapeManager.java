package com.cooksonkd.ootestapplication;
import java.util.ArrayList;
import java.util.List;

import com.cooksonkd.ootestapplication.ShapeRenderer;


public class ShapeManager {
	private ShapeRenderer shapeRenderer = ShapeRenderer.getInstance();
	
	public void scale (Shape shape, double factor) {
		if(shape instanceof Circle) {
			((Circle) shape).radius *= factor;
		}
		else if (shape instanceof Rectangle) {
			((Rectangle) shape).height *= factor;
			((Rectangle) shape).width *= factor;
		}
	}
	
	public double area(Circle circle) {
		return Math.PI * circle.radius * circle.radius;
	}
	
	public double area(Rectangle rectangle) {
		return rectangle.width * rectangle.height;
	}
	
	public void render(List<Shape> shapes) {
		for (Shape shape : shapes) {
			if (shape instanceof Circle) {
				shapeRenderer.render((Circle) shape);
			}
			else if (shape instanceof Rectangle) {
				shapeRenderer.render((Rectangle) shape);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeManager sm = new ShapeManager();
		
		ArrayList<Shape> testShape = new ArrayList<Shape>();
		
		Shape circle = new Circle();
		Shape rectangle = new Rectangle();
		
		
	}
}


