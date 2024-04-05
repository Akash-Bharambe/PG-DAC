package test_static;
import static java.lang.System.out;

public class Test {
	private int i;
	private static int j=10;
	static {
		out.println("in 1st static init block " + j);
		j = 100;// init static data
	}
	static {
		out.println("in 2nd static init block");
	}
	// non static init block
	{
		out.println("in instance init block");
	}
	//parameterized ctor
	public Test(int i) {
		out.println("in ctor");
		this.i=i;
	}
	

	public static void main(String[] args) {
		out.println("in main");
		Test t1=new Test(11);
		Test t2=new Test(12);
		show();
		t1.show2();
		
	}

	// static method
	public static void show() {
		out.println("in static method " + j);
	}

	// non static method
	public void show2() {
		out.println("in non static  method " + i + " " + j);
	}

}
