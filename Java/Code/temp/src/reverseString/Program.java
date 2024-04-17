package reverseString;

public class Program {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello"); 
		
		for (int i = 0; i < (sb.length()-1)/2; i++) {
			int front = i;
			int back = sb.length() - 1 -i;
			char f= sb.charAt(front);
			char b=sb.charAt(back);
			
			sb.setCharAt(front, b);
			sb.setCharAt(back, f);
		}
		System.out.println(sb);
	}
}
