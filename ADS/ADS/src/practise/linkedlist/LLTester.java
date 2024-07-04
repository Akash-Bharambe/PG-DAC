package practise.linkedlist;

public class LLTester {

	public static void main(String[] args) {
		LinkedList list = new LinkedListImpl(100);
		
		list.addFront(30);
		list.addFront(40);
		list.addFront(50);
		list.addFront(60);
		list.addLast(1000);
		list.addFront(10);
		list.addAt(6, 20);
		list.removeAt(10);
//		list.removefront();
//		list.removeLast();
//		list.removefront();
		
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
		
	}

}
