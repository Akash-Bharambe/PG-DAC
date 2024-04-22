package p3;

public class Tester {

	public static void main(String[] args) {
		// add 2 numbers 
		Computable ref=new Adder();
		System.out.println("Addition res "+ref.compute(10, 20));
		// multiply 2 numbers 
		 ref=new Multiplier();
		System.out.println("Addition res "+ref.compute(10, 20));
		/*
		 * Instead of creating a separate class n passing imple class instance
		 * Can you DIRECTLY pass a behavior? YES
		 * double compute(double a, double b);
		 */
	//	Computable ref2=(double a, double b) -> {return a+b;};
		/*
		 * Can a functional i/f ref ---> lamda expression!
		 * 
		 */
		Computable ref2=(a,  b) ->  a+b;
		System.out.println("Addition res "+ref2.compute(10, 20));
		//add a lmabda expression to divide the nos.
		ref2=(x,y) -> x/y;
		System.out.println("Div res "+ref2.compute(10, 2));
		
	}

}
