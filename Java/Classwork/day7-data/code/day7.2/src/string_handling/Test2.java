package string_handling;
// ref equality (==) vs content equality
public class Test2 {

	public static void main(String[] args) {
		String s1=new String("hello");
		String s2=new String("hello");
		String s3=new String("Hello");
		// == => reference equality
		System.out.println(s1==s2);//f
		System.out.println(s1==s3);//f
		//
		System.out.println(s1.equals(s2));//t
		System.out.println(s1.equals(s3));//f
		System.out.println(s1.equalsIgnoreCase(s3));//t

	}

}
