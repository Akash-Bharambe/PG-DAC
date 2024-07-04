package practise.linkedlist;

public interface LinkedList extends Iterable<Integer> {
	
	class Node{
		Node next;
		Node prev;
		int data;
		
		public Node(int data) {
			this.data = data;
		}		
	}
	
	void addAt(int position, int data);
	void addFront(int data);
	void addLast(int data);
	
	Integer removefront();
	Integer removeLast();
	Integer removeAt(int position);
	
	boolean isEmpty();
}
