package tester;

import java.util.List;

import fruits.Fruit;
import fruits.Mango;

public class Test {

	public static void main(String[] args) {
		Fruit f = new Mango();
		f.taste();
		((Mango) f).pulp();
		f = new Fruit();
		f.taste();
		Mango m=(Mango)new Fruit();//class cast exc.
		m.pulp();
	//	List<?> list;

	}

}
