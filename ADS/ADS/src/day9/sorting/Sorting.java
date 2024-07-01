package day9.sorting;

import java.util.Arrays;

public class Sorting {
	
	public static <T extends Comparable<T>> boolean isArraySorted(T[] arr) {
		// Let us assume that array is sorted in ascending order
		boolean isAscending = true;
		int i = 1;
		int j = i + 1;
		
		// skip all equal elements
		while (arr[i++].equals(arr[j++])) {
		}

		// Check if array is sorted in descending order
		if (arr[i].compareTo(arr[j]) > 0) {
			isAscending = false;
		}
		
		// Check remaining elements
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

	public static <T extends Comparable<T>> void mergeSort(T[] arr) {
		mergeSort(arr, 0, arr.length - 1);
	}

	private static <T extends Comparable<T>> void mergeSort(T[] arr, int start, int end) {
		
		// If size of sub array is 1 or less than 1 STOP
		if ((end - start + 1) <= 1) {
			return;
		}
		
		// Calculate middle of the array
		int middle = start + ((end - start) / 2);
		
		// Sort first half of sub array
		mergeSort(arr, start, middle);
		
		// Sort second half of sub array
		mergeSort(arr, middle + 1, end);
		
		// Merge
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

		// Elements in newArr is sorted
		// Copy elements from newArr to original array
		for (int i = start1, j = 0; i < r; j++, i++) {
			arr[i] = newArr[j];
		}

	}

	public static <T extends Comparable<T>> void quickSort(T[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	private static <T extends Comparable<T>> void quickSort(T[] arr, int start, int end) {

		// if size of sub array is 1 or less than 1 STOP
		if ((end - start + 1) <= 1) {
			return;
		}

		// create partition and get new pivot position
		int pivotPos = partition(arr, start, end);

		// Sort for sub array to the left of pivot
		quickSort(arr, start, pivotPos - 1);

		// Sort for sub array to the right of pivot
		quickSort(arr, pivotPos + 1, end);
	}

	private static <T extends Comparable<T>> int partition(T[] arr, int start, int end) {

		// Assume pivot position at start
		int pivotPos = start;
		int left = start + 1;
		int right = end;

		while (left <= right) {

			// If element at left is less than pivot increment left
			while (left <= right && arr[left].compareTo(arr[pivotPos]) < 0) {
				left++;
			}
			// If element at right is greater than pivot decrement right
			while (left <= right && arr[right].compareTo(arr[pivotPos]) > 0) {
				right--;
			}

			// If element at left is greater than pivot and element at right is less than
			// pivot, control comes here

			// if left is less than right swap element at left with element at right
			if (left < right) {
				T temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;
			}
		}

		// left and right crossed each other, so control comes here

		// Now to the right of right there are elements greater than element at pivot
		// To the left of right there are elements less than pivot
		// Hence proper position of pivot is found, so swap element at right and element
		// at pivot
		T temp = arr[right];
		arr[right] = arr[pivotPos];
		arr[pivotPos] = temp;
		return right;
	}

	public static void main(String[] args) {
		Integer[] arr = { 2, 4, 1, 5, 8, 9, 7 };
//		Integer[] arr = { 1, 2, 4, 5, 7, 8, 9 };
		quickSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(isArraySorted(arr));
	}

}
