package day8.searching;

import day8.sorting.Sorting;

public class Searching {

	public static <T extends Comparable<T>> boolean findUsingLinearSearch(T[] arr, T element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(element)) {
				return true;
			}
		}
		return false;
	}

	public static <T extends Comparable<T>> boolean findUsingBinarySearch(T[] arr, T element) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = low + ((high - low) / 2);
			if (arr[mid].equals(element)) {
				return true;
			}
			if (arr[mid].compareTo(element) > 0) {
				high = mid - 1;
				continue;
			}
			if (arr[mid].compareTo(element) < 0) {
				low = mid + 1;
				continue;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Integer[] arr = { 2, 4, 1, 5, 8, 9, 7 };
		System.out.println(findUsingLinearSearch(arr, 10));
		
		Sorting.bubbleSortAsc(arr);
		System.out.println(findUsingBinarySearch(arr, 10));
	}

}
