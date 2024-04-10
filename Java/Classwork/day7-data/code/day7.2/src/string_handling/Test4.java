package string_handling;

import java.util.Arrays;

//String class API
public class Test4 {

	public static void main(String[] args) {
		String s1 = "Hello8 hi1 ho4w are6 you9 hi6 again ?";
		System.out.println(s1.charAt(0) + " " + s1.charAt(s1.length() - 1));
		System.out.println(s1.contains("hi"));
		// rets int index of 1st occurrence of the specified string
		System.out.println(s1.indexOf("hi") + " " + s1.lastIndexOf("hi"));
		System.out.println(s1.indexOf('H'));// 0
		// split s1 : using delimiter : whitespace
		System.out.println(Arrays.toString(s1.split(" ")));
		// split s1 : using delimiter : a digit
		System.out.println(Arrays.toString(s1.split("\\d")));
		// lexicographical ordering (based upon comparison of unicode values)
		System.out.println("Anish".compareTo("Amiti"));// 1
		System.out.println("Sahil".compareTo("Sameer"));// -5
		System.out.println("Riya".compareTo("Riya"));// 0

	}

}
