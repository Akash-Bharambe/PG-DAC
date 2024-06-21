package temp;

class ListNode<T> {

	public T value;
	public ListNode<T> next;

	public ListNode() {
		this.value = null;
		this.next = null;
	}

	public ListNode(T value) {
		this.value = value;
		this.next = null;
	}

	public ListNode(T value, ListNode<T> next) {
		this.value = value;
		this.next = next;
	}

}

class List <T>{
	public void insertAtFirst(T element) {
		
	}
}

public class LinkedList {

	public static void main(String[] args) {
		ListNode<String> nameList = new ListNode<>();
		String name = "Akash";
		
		ListNode<String> current = nameList;
		for (int i = 0; i < name.length(); i++) {
			ListNode<String> node = new ListNode<>(name.charAt(i) + "");
			current.next = node;
			current = node;
		}
		current = nameList.next;
//		ListNode<String> temp = nameList;
		while (current != null) {
			System.out.println(current.value+" ");
			current = current.next;
		}
		
	}
	
}
