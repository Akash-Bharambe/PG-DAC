package twoSum;

public class Program {

	public static void main(String[] args) {
		int arr[] = {0, -1, 2, -3, 1};
		int x= -2;
		boolean flag = false;
		for (int i : arr) {
			for (int j : arr) {
				if (i + j == x) {
					flag= true;
					break;
				}
			}
		}
		String string = flag ? "Yes" : "No" ;
		System.out.println(string);
	}

}
