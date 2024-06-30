package day9.sorting;

import java.util.Arrays;

public class Sorting {

	public static <T extends Comparable<T>> void insertionSort(T[] arr) {
		int sortedSize = 1;

		while (sortedSize < arr.length) {
			T elementToInsert = arr[sortedSize];
			int i = sortedSize - 1;
			while (i >= 0) {
				if (arr[i].compareTo(elementToInsert) > 0) {
					arr[i + 1] = arr[i--];
				} else {
					break;
				}
			}
			arr[i + 1] = elementToInsert;
			sortedSize++;
		}
	}

	public static <T extends Comparable<T>> boolean isArraySorted(T[] arr) {
		boolean isAscending = true;
		int i = 1;
		int j = i + 1;
		while (arr[i++].equals(arr[j++])) {
		}

		if (arr[i].compareTo(arr[j]) > 0) {
			isAscending = false;
		}
		for (; i < arr.length; i++) {
			for (; j < arr.length; j++) {
				if (isAscending) {
					if (arr[i].compareTo(arr[j]) > 0) {
						return false;
					}
				} else {
					if (arr[i].compareTo(arr[j]) < 0) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static <T extends Comparable<T>> void mergeSort(T[] arr) {
		mergeSort(arr, 0, arr.length - 1);
	}

	private static <T extends Comparable<T>> void mergeSort(T[] arr, int start, int end) {
		if ((end - start + 1) <= 1) {
			return;
		}
		int middle = start + ((end - start) / 2);
		mergeSort(arr, start, middle);
		mergeSort(arr, middle + 1, end);

		merge(arr, start, middle, middle + 1, end);
	}

	private static <T extends Comparable<T>> void merge(T[] arr, int start1, int end1, int start2, int end2) {
		int i1 = start1;
		int i2 = start2;
		int r = 0;
		@SuppressWarnings("unchecked")
		T[] newArr = (T[]) java.lang.reflect.Array.newInstance(arr.getClass().getComponentType(), end2 - start1 + 1);

		// To check elements in sorted array and put elements in newArr
		while (i1 <= end1 && i2 <= end2) {
			if (arr[i1].compareTo(arr[i2]) < 0) {
				newArr[r++] = arr[i1++];
			} else {
				newArr[r++] = arr[i2++];
			}
		}

		// If elements in first array are yet to be added
		while (i1 <= end1) {
			newArr[r++] = arr[i1++];
		}

		// If elements in second array are yet to be added
		while (i2 <= end2) {
			newArr[r++] = arr[i2++];
		}

		// Copy elements from newArr to original array
		for (int i = start1, j = 0; i < r; j++, i++) {
			arr[i] = newArr[j];
		}

	}

	public static <T extends Comparable<T>> void quickSort(T[] arr) {

	}

	public static void main(String[] args) {
		Integer[] arr = { 2, 4, 1, 5, 8, 9, 7 };
//		Integer[] arr = { 1, 2, 4, 5, 7, 8, 9 };
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(isArraySorted(arr));
	}

}
