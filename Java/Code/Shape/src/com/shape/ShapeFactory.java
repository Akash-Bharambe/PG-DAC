package com.shape;

public class ShapeFactory {
	private ShapeFactory() {
		
	}
	public static Shape getShape(ShapeType choice) {
		switch (choice) {
		case RECTANGLE: return new Rectangle();
		case CIRCLE: return new Circle();
		case EXIT:
			break;
		default:
			break;
		}
		return null;
		
	}
}
