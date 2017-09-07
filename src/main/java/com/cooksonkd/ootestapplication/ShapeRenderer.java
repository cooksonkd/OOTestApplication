package com.cooksonkd.ootestapplication;
import java.util.ArrayList;

public class ShapeRenderer {
	private static final ShapeRenderer INSTANCE = new ShapeRenderer();
	private ArrayList<Shape> shapes;
	
	public ShapeRenderer() {
		shapes = new ArrayList<Shape>();
	}
	
	public static ShapeRenderer getInstance() {
		return INSTANCE;
	}
	
	public void render(Circle circle) {
		INSTANCE.shapes.add(circle);
	}
	
	public void render(Rectangle rectangle) {
		INSTANCE.shapes.add(rectangle);
	}
	
}