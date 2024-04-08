package com.stack;

import java.util.Scanner;

import com.customer.Customer;

public class FixedStack implements Stack {

	private int top;
	private Customer[] customers;
	private static Scanner scanner = new Scanner(System.in);

	public FixedStack() {
		super();
		this.top = -1;
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

	@Override
	public void push() {
		if (isFull()) {
			System.out.println("Stack Full");
		} else {
			System.out.println("Enter Customer Name: ");
			String name = scanner.nextLine();
			System.out.println("Enter Customer Address: ");
			String add = scanner.nextLine();

			top++;
			customers[top] = new Customer(name, add);
		}
	}

	@Override
	public boolean isEmpty() {
		return top < 0;
	}

	@Override
	public boolean isFull() {
		return top == STACK_SIZE - 1;
	}

	@Override
	public void peep() {
		if (isEmpty()) {
			return;
		}
		System.out.println(customers[top].toString());
	}

}
