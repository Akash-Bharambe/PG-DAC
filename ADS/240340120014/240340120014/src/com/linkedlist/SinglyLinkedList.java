package com.linkedlist;

import java.util.Iterator;

public class SinglyLinkedList implements LinkedList {
	
	Node head;
	Node tail;
	int size;
	
	public SinglyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	// Add at Last position method
	// Time Complexity: O(1)
	@Override
	public void add(int value) {
		Node node = new Node(value);

		// For Handling Empty LinkedList
		if (isEmpty()) {
			head = node;
			tail = node;
		} else { // For Handling LinkedList with Nodes
			tail.next = node;
			tail = node;
		}
		size++;
	}

	// Time Complexity: O(n)
	@Override
	public boolean isPalindrome() {
		// If there is no element or single element
        if (head == null || head.next == null) {
            return true;
        }

        // Find the middle of the linked list
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        Node prev = null, current = slow, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            
            prev = current;
            current = next;
        }

        // Compare the first half and the reversed second half
        Node firstHalf = head;
        Node secondHalf = prev;
        boolean isPalindrome = true;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Restore the second half of the linked list
        current = prev;
        prev = null;
        next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return isPalindrome;
    }

	
	// Time Complexity: O(n)
	@Override
	public void displayReverse() {
		Node current = head;
		Node prev = null;
		Node next = null;
		
		// Reverse the list
		while(current != null){
		    next = current.next;
		    current.next = prev;

		    prev = current;
		    current = next;
		}
		
		Node trav = prev;
		
		// Print Reverse List
		while (trav != null) {
			System.out.print(trav.data + " -> ");
			trav = trav.next;
		}
		
		System.out.println();
		
		// Restore the list back to original
        current = prev;
        prev = null;
        next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
	}

	// O(1) time Complexity just by using 1 extra data member in implementation class
	@Override
	public int size() {
		return size;
	}
	
	// This method is in case when size field is not used in Linked List.
	// But its time complexity is O(n) as traversal is done from head till last node
	@Override
	public int sizeOfLinkedList() {
		Node currentNode = head;
		int count = 0;
		
		// Traverse from head till tail to count number of nodes
		while (currentNode != null) {
			count++;
			currentNode = currentNode.next;
		}
		return count;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public Iterator<Node> iterator() {
		
		return new Iterator<LinkedList.Node>() {

			Node current = head;
			
			@Override
			public boolean hasNext() {
				
				return current != null;
			}

			@Override
			public Node next() {
				
				Node node = current;
				current = current.next;
				return node;
			}
		};
	}
	
	@Override
	public void printList() {
		// Get current List's Iterator
        Iterator<Node> iterator = iterator();
        
        // Traverse till list has last element
        while (iterator.hasNext()) {
        	
            Node node = iterator.next();
            System.out.print(node.data + " -> ");
        }
        System.out.println("");
    }
	
	@Override
	public int deleteAtEnd() {
		// If list is empty throw exception
		if (isEmpty()) {
			throw new EmptyLinkedListException("Linked List is Empty");
		}
		
		Node currentNode = head;

		// Traverse till second last node
		while (currentNode.next.next != null) {
			currentNode = currentNode.next;
		}
		int value = currentNode.next.data;
		currentNode.next = null;
		tail = currentNode;

		return value;
	}
	
}

