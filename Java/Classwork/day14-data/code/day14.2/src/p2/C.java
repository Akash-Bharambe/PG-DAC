package p2;

public class C implements A, B {
	@Override
	public void show() {
		System.out.println("C' show");
		//to invoke A's show
		A.super.show();
		B.super.show();
	}
}
