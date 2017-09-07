package com.cooksonkd.ootestapplication;
import java.util.List;

import com.cooksonkd.ootestapplication.ShapeRenderer;


public class ShapeManager {
	private ShapeRenderer shapeRenderer = ShapeRenderer.getInstance();
	
	/**
	 * @param shape
	 * @param factor
	 * scales instance variables of shapes by factor
	 */
	public void scale (Shape shape, double factor) {
		if(shape instanceof Circle) {
			((Circle) shape).radius *= factor;
		}
		else if (shape instanceof Rectangle) {
			((Rectangle) shape).height *= factor;
			((Rectangle) shape).width *= factor;
		}
	}
	
	
	/**
	 * @param shape
	 * @return area of shape based on instance
	 */
	public double area(Shape shape) {
		double area = 0;
		
		if(shape instanceof Circle) {
			area =  Math.PI * ((Circle) shape).radius * ((Circle) shape).radius;
		}
		else if(shape instanceof Rectangle) {
			area = ((Rectangle) shape).width * ((Rectangle) shape).height;
		}
		return area;
	}
	
	/**
	 * @param shapes
	 * renders string containing details of shape
	 */
	public void render(List<Shape> shapes) {
		for (Shape shape : shapes) {
			if (shape instanceof Circle) {
				shapeRenderer.render((Circle) shape);
				this.area(shape);
			}
			else if (shape instanceof Rectangle) {
				shapeRenderer.render((Rectangle) shape);
			}
		}
	}
	
}


