package operators;

public class TestBasicOperator {

	public static void main(String[] args) {
		int n1=10;
		int n2=++n1;
		System.out.println(n2+" "+n1);
		
		boolean jobDone=true;
		boolean flag=!jobDone;
		System.out.println(flag);
		int data=100;
		System.out.println(data>100?"Yes":"No");
		int data2=50;
		if(data > 600 && data2 < 100)
			System.out.println("test performed...");
		else 
			System.out.println("test not performed...");

	}

}
