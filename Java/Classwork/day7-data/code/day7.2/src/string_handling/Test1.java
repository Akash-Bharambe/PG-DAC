package string_handling;
//immutability of the strings
public class Test1 {

	public static void main(String[] args) {
		 String s1=new String("hello");
		s1.concat("hi");
		System.out.println(s1);//hello
		s1 += "123456";//s1=s1.concat("123456");
		System.out.println(s1);//hello123456
		String s2=s1.concat("abcd");
		System.out.println(s1);//hello123456
		System.out.println(s2);//hello123456abcd
		System.out.println(s2.toUpperCase());//upper cased
		System.out.println(s2);//lower cased : hello123456abcd
		String s3=s2.replace('l', 't');
		System.out.println(s2);//orig
		System.out.println(s3);//replaced !
		

	}

}
