package day3.queue.linkedlist;

import java.util.Iterator;

import day3.linkedlist.LinkedList;
import day3.linkedlist.LinkedList.Node;
import day3.linkedlist.LinkedListImpl;

public class QueueImpl<T> implements Queue<T> {

	private LinkedList<T> list;
	private int size;
	

	public QueueImpl() {
		this.list = new LinkedListImpl<T>();
		this.size = 0;
	}

	@Override
	public void enqueue(T element) {
		list.insertAtEnd(element);
		size++;
	}

	@Override
	public T dequeue() {
		size--;
		return list.deleteAtStart();
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public T peek() {
		T t = list.deleteAtStart();
		list.insertAtStart(t);
		return t;
	}

	@Override
	public Iterator<T> iterator() {
		
		return new Iterator<T>() {
			
			private Iterator<Node<T>> it =  list.iterator();
			
			@Override
			public boolean hasNext() {
				return it.hasNext();
			}

			@Override
			public T next() {
				return it.next().getValue();
			}
		};
	}
	
}
