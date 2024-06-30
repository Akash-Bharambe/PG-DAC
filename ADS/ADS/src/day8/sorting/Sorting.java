package day8.sorting;

import java.util.Arrays;

public class Sorting {

	public static <T extends Comparable<T>> void bubbleSortAsc(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static <T extends Comparable<T>> void bubbleSortDesc(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) < 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Integer[] arr = { 2, 4, 1, 5, 8, 9, 7 };
		bubbleSortDesc(arr);
		System.out.println(Arrays.toString(arr));
	}

}
