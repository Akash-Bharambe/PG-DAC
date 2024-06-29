package temp.queue.circular.linkedlist;

import java.util.Arrays;

public class MergeArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 6, 7, 8, 9, 10 };
		int arr3[] = new int[arr.length + arr2.length];

		for (int i = 0; i < arr3.length; i++) {
			if (i % 2 != 0)
				arr3[i] = arr2[i / 2];
			else
				arr3[i] = arr[i / 2];
		}
		System.out.println(Arrays.toString(arr3));
	}
}
