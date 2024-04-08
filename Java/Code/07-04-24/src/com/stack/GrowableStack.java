package com.stack;

import java.util.Scanner;

import com.customer.Customer;

public class GrowableStack implements Stack {
	private int top;
	private static int size;
	private static Customer[] customers;
	private static Scanner scanner = new Scanner(System.in);

	public GrowableStack() {
		super();
		this.top = -1;
		size = STACK_SIZE;
		customers = new Customer[STACK_SIZE];
	}

	@Override
	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			customers[top].setId(customers[top].getId() - 1);
			customers[top] = null;
			top--;
		}
	}

	private static Customer[] createNewArray() {
		size += STACK_SIZE;
		Customer[] newArray = new Customer[size];
		for (int i = 0; i < customers.length; i++) {
			newArray[i] = customers[i];
		}
		return newArray;
	}

	@Override
	public void push() {
		if (isFull()) {
			customers = createNewArray();
		} 
			System.out.println("Enter Customer Name: ");
			String name = scanner.nextLine();
			System.out.println("Enter Customer Address: ");
			String add = scanner.nextLine();

			top++;
			customers[top] = new Customer(name, add);
		
	}

	@Override
	public boolean isEmpty() {
		return top < 0;
	}

	@Override
	public boolean isFull() {
		return top == size -1;
	}

	@Override
	public void peep() {
		if (isEmpty()) {
			return;
		}
		System.out.println(customers[top].toString());
	}
}
