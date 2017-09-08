package com.cooksonkd.ootestapplication;
import java.util.List;

import com.cooksonkd.ootestapplication.ShapeRenderer;


/**
 * @author Keenan Cookson
 *
 */
public class ShapeManager {
	private ShapeRenderer shapeRenderer = ShapeRenderer.getInstance();
	
	/**
	 * @param shape casts type Shape to the type of the class for which it is an instance
	 * @param factor scales instance variables of shapes by factor
	 */
	public void scale (Shape shape, double factor) {
		if(shape instanceof Circle) {
			double newRadius;
			newRadius = ((Circle) shape).radius *= factor;
			((Circle) shape).setRadius(newRadius);
		}
		else if (shape instanceof Rectangle) {
			double newWidth;
			double newHeight;
			newHeight = ((Rectangle) shape).height *= factor;
			newWidth = ((Rectangle) shape).width *= factor;
			((Rectangle) shape).setWidth(newWidth);
			((Rectangle) shape).setHeight(newHeight);
		}		
	}
	
	
	/**
	 * @param shape
	 * @return area of shape based on instance
	 */
	public double area(Shape shape) {
		double area = 0;
		
		if(shape instanceof Circle) {
			area = ((Circle) shape).area();
		}
		else if(shape instanceof Rectangle) {
			area = ((Rectangle) shape).area();
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


