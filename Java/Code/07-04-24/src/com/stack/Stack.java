package com.stack;

public interface Stack {
	
	int STACK_SIZE = 2;
	
	void pop();
	void push();
	void peep();
	boolean isEmpty();
	boolean isFull();
}
