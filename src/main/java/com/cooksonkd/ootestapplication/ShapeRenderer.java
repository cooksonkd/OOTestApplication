package com.cooksonkd.ootestapplication;

/**
 * @author Net2
 * 
 */

class ShapeRenderer {
	private static final ShapeRenderer INSTANCE = new ShapeRenderer();
	
	/**
	 * @return INSTANCE of ShapeRenderer
	 */
	public static ShapeRenderer getInstance() {
		return INSTANCE;
	}
	
	/**
	 * @param shape
	 * @return a string that displays object instance variables
	 */
	public void render(Shape shape) {
		System.out.print(shape.toString());
	}
	
	
}