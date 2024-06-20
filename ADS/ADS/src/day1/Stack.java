package day1;

import java.lang.reflect.Array;
import java.util.Arrays;

class StackOverFlowException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public StackOverFlowException(String message) {
		super(message);
	}
}

class StackUnderFlowException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public StackUnderFlowException(String message) {
		super(message);
	}
}

class Stackk<T> {
	private int top;
	private T arr[];

	@SuppressWarnings("unchecked")
	public Stackk(Class<T> clazz, int size) {
		top = -1;
		arr = (T[]) Array.newInstance(clazz, size);
	}

	public int size() {
		return arr.length;
	}

	public boolean isFull() {
		return arr.length - 1 == top;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public T push(T element) {
		if (!isFull()) {
			top++;
			arr[top] = element;
			return arr[top];
		}
		throw new StackOverFlowException("Stack is Full");

	}

	public T pop() {
		if (!isEmpty()) {
			top--;
			return arr[top + 1];
		}
		throw new StackUnderFlowException("Stack is Empty");
	}

	public T peek() {
		if (!isEmpty()) {
			return arr[top];
		}
		throw new StackUnderFlowException("Stack is Empty");
	}

	@Override
	public String toString() {
		return "Stackk " + Arrays.toString(arr);
	}
}

public class Stack {
	public static void main(String[] args) {
		Stackk<Integer> stackk = new Stackk<>(Integer.class, 10);
		System.out.println("Push: " + stackk.push(1));
		System.out.println("Push: " + stackk.push(2));
		System.out.println("Pop: " + stackk.pop());
		System.out.println("Peek: " + stackk.peek());
		System.out.println(stackk);
	}
}
