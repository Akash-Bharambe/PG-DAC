package p1;
//to create the concrete imple class
public class MyFormula2 implements Formula{

	@Override
	public double calculate(double a) {
		// TODO Auto-generated method stub
		return a*2;
	}
	//Can you override inherite def imple ? YES

	@Override
	public double sqrt(double a, double b) {
		// TODO Auto-generated method stub
		return Math.sqrt(a-b);
	}
	
	

}
