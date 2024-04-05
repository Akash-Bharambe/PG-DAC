package program;

import com.shape.Shape;
import com.shape.ShapeFactory;
import com.shape.ShapeType;

public class Program {

	public static void main(String[] args) {
		ShapeType choice;
		ShapeTest test = new ShapeTest();
		while ((choice = ShapeTest.menulist()) != ShapeType.EXIT) {
			Shape sh = ShapeFactory.getShape(choice);
			test.setShape(sh);
			test.acceptRecord();
			test.printRecord();
		}
	}

}
