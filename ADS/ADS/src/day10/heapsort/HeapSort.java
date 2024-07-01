package day10.heapsort;

import java.util.Arrays;

public class HeapSort {

	public static <T extends Comparable<T>> void heapSort(T[] arr) {
		
		// Convert Array to max heap
		convertToMaxHeap(arr, arr.length);

		// last child of max heap will be at last position of array
		int lastChildPos = arr.length - 1;

		while (lastChildPos > 0) {
			
			// Swap root and last child
			T temp = arr[0];
			arr[0] = arr[lastChildPos];
			arr[lastChildPos] = temp;

			// Rebuild max head including last element
			if (lastChildPos > 1) {
				makeMaxHeap(arr, 0, lastChildPos);
			}
			--lastChildPos;
		}
	}

	public static <T extends Comparable<T>> void convertToMaxHeap(T[] arr, int n) {
		int lastparent = (n / 2) - 1;

		while (lastparent >= 0) {
			makeMaxHeap(arr, lastparent, n);
			--lastparent;
		}

	}

	public static <T extends Comparable<T>> void makeMaxHeap(T[] arr, int parent, int n) {
		// Assume Max child as left child
		int maxChildPos = (2 * parent) + 1;
		int rightChildPos = (2 * parent) + 2;

		if (rightChildPos < n) {
			
			// if right child element is greater than left child element
			if (arr[maxChildPos].compareTo(arr[rightChildPos]) < 0) {
				
				// set max child position to right child position 
				maxChildPos = rightChildPos;
			}
		}

		// if parent element is greater than max child element STOP
		if (arr[parent].compareTo(arr[maxChildPos]) > 0) {
			return;
		}

		// Control comes here is parent element is less than max child element
		// So, swap parent element and max child element
		T temp = arr[parent];
		arr[parent] = arr[maxChildPos];
		arr[maxChildPos] = temp;

		// If left child position is greater than or equal to n STOP
		int leftChildOfMax = (2 * maxChildPos) + 1;
		if (leftChildOfMax >= n) {
			return;
		}
		
		// as child is swapped, check if max child is a max heap
		makeMaxHeap(arr, maxChildPos, n);
	}
	
	public static void main(String[] args) {
		Integer[] arr = { 2, 4, 1, 5, 8, 9, 7 };
//		Integer[] arr = { 1, 2, 4, 5, 7, 8, 9 };
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
