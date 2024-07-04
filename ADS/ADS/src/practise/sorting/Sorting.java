package practise.sorting;

import java.util.Arrays;

public class Sorting {

	public static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int smallestIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				smallestIndex = arr[smallestIndex] > arr[j] ? j : smallestIndex;
			}
			int temp = arr[i];
			arr[i] = arr[smallestIndex];
			arr[smallestIndex] = temp;
		}
	}

	public static void insertionSort(int[] arr) {

		int sortedArraySize = 1;
		while (sortedArraySize < arr.length) {
			int elementToBeSorted = arr[sortedArraySize];
			int i = sortedArraySize - 1;
			while (i >= 0) {
				if (arr[i] > elementToBeSorted) {
					arr[i + 1] = arr[i--];
				} else {
					break;
				}
			}
			arr[i + 1] = elementToBeSorted;
			sortedArraySize++;
		}
	}

	public static void mergeSort(int arr[]) {
		mergeSort(arr, 0, arr.length - 1);
	}

	private static void mergeSort(int[] arr, int start, int end) {

		if (start >= end) {
			return;
		}
		int mid = start + (end - start) / 2;

		mergeSort(arr, start, mid);
		mergeSort(arr, mid + 1, end);
		merge(arr, start, mid, end);

	}

	private static void merge(int[] arr, int start, int mid, int end) {

		int[] mergedArray = new int[end - start + 1];

		int i1 = start;
		int i2 = mid + 1;
		int mIndex = 0;
		while (i1 <= mid && i2 <= end) {
			if (arr[i1] < arr[i2]) {
				mergedArray[mIndex++] = arr[i1++];
			} else {
				mergedArray[mIndex++] = arr[i2++];

			}
		}

		while (i1 <= mid) {
			mergedArray[mIndex++] = arr[i1++];
		}
		while (i2 <= end) {
			mergedArray[mIndex++] = arr[i2++];
		}

		for (int i = 0, j = start; i < mergedArray.length; i++, j++) {
			arr[j] = mergedArray[i];
		}

	}

	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	private static void quickSort(int[] arr, int start, int end) {
		if ((end - start + 1) <= 1)
			return;

		int pivot = partition(arr, start, end);
		
		quickSort(arr, start, pivot - 1);
		quickSort(arr, pivot + 1, end);
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = start;
		int left = start + 1;
		int right = end;
		
		while (left <= right) {
			while (left <= right && arr[left] <= arr[pivot]) {
				left++;
			}
			while (left <= right && arr[right] >= arr[pivot]) {
				right--;
			}
			
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		int temp = arr[right];
		arr[right] = arr[pivot];
		arr[pivot] = temp;
		
		return right;
	}

	public static void main(String[] args) {

		int[] arr = { 4, 5, 3, 2, 7, 8, 0 };

		quickSort(arr);

		System.out.println(Arrays.toString(arr));
	}

}
