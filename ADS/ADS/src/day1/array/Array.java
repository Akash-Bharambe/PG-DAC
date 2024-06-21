package day1.array;

public class Array {

	public static <T> T[] insert(T arr[], T value, int position) {
		@SuppressWarnings("unchecked")
		T newArr[] = (T[]) java.lang.reflect.Array.newInstance(arr.getClass().getComponentType(), arr.length + 1);

		for (int i = 0, j = 0; i < newArr.length; i++, j++) {
			if (i == position) {
				newArr[i] = value;
				j--;
				continue;
			}
			newArr[i] = arr[j];
		}
		return newArr;
	}

	public static int maxNumber(Integer arr[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = arr[i] > max ? arr[i] : max;
		}
		return max;
	}

	public static int minNumber(Integer arr[]) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			min = arr[i] > min ? min : arr[i];
		}
		return min;
	}

	public static int sumOfEven(Integer arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		return sum;
	}

	public static int sumOfOdd(Integer arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				sum += arr[i];
			}
		}
		return sum;
	}

	public static int secondMax(Integer arr[]) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] < max) {
				secondMax = arr[i];
			}
		}
		return secondMax;
	}

	public static int secondMin(Integer arr[]) {
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				secondMin = min;
				min = arr[i];
			} else if (arr[i] < secondMin && arr[i] > min) {
				secondMin = arr[i];
			}
		}
		return secondMin;
	}

	public static <T> void displayArray(T arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer arr1[] = { 1, 9, 3, 5, 6, 7 };
		arr1 = insert(arr1, 4, 3);
		displayArray(arr1);

		String arr[] = { "A", "k", "a", "h" };
		arr = insert(arr, "s", 3);
		displayArray(arr);

		System.out.println("Sum of even numbers: " + sumOfEven(arr1));
		System.out.println("Sum of odd numbers: " + sumOfOdd(arr1));
		System.out.println("Max num: " + maxNumber(arr1));
		System.out.println("Second Max: " + secondMax(arr1));
		System.out.println("Min num: " + minNumber(arr1));
		System.out.println("Second Min: " + secondMin(arr1));
		
	}

}
