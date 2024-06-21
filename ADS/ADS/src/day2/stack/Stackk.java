package day2.stack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class Stackk<T> implements StackInterface<T> {
	private int top;
	private T arr[];

	@SuppressWarnings("unchecked")
	public Stackk(Class<T> clazz, int size) {
		top = -1;
		arr = (T[]) Array.newInstance(clazz, size);
	}

	@Override
	public int size() {
		return arr.length;
	}

	@Override
	public boolean isFull() {
		return arr.length - 1 == top;
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public T push(T element) {
		if (!isFull()) {
			arr[++top] = element;
			return arr[top];
		} else {
			arr = resizeStack();
			return push(element);
		}
	}

	@Override
	public T pop() {
		if (!isEmpty()) {
			T popped = arr[top];
			arr[top] = null;
			top--;
			return popped;
		}
		throw new StackUnderFlowException("Stack is Empty");
	}

	@Override
	public T peek() {
		if (!isEmpty()) {
			return arr[top];
		}
		throw new StackUnderFlowException("Stack is Empty");
	}

	private T[] resizeStack() {
		@SuppressWarnings("unchecked")
		T[] newArr = (T[]) Array.newInstance(arr.getClass().getComponentType(), this.arr.length * 2);
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		System.out.println("Resized");
		return newArr;
	}

	@Override
	public String toString() {
		return "Stackk " + Arrays.toString(arr);
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				return arr[index] == null ? false : index < arr.length;
			}

			@Override
			public T next() {
				return arr[index++];
			}
		};
	}

	@Override
	public boolean contains(T[] array) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (arr[i].equals(array[j])) {
					return true;
				}
			}
		}
		return false;
	}
}
