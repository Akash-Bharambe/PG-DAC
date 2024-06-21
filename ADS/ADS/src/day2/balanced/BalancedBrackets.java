package day2.balanced;

import day2.stack.Stackk;

public class BalancedBrackets {

	public static boolean checkBalanced(String string) {
		Stackk<Character> stackk = new Stackk<>(Character.class, string.length());
		
		for (Character ch : string.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stackk.push(ch);
			}else if (ch == ')' || ch == '}' || ch == ']') {
				if (stackk.isEmpty()) {
					return false;
				}
				char top = stackk.pop();
				if (ch == ')' && top != '(' || ch == '}' && top != '{' || ch == ']' && top != '[' ) {
					return false;
				}
			}
		}
		return stackk.isEmpty();
	}

	public static void main(String[] args) {
		String string = "{ ( [ ] ) }";
		System.out.println(checkBalanced(string) ? "Balanced" : "Not Balanced");
	}

}
