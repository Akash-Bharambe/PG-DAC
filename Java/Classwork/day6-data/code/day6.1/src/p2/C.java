package p2;

public class C implements A,B{

	@Override
	public double compute(double a, double b) {
		System.out.println(A.DATA+" "+B.DATA);
		return 0;
	}

}
