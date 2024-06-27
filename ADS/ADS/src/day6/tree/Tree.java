package day6.tree;

public interface Tree<T> extends Iterable<Tree.Node<T>> {

	class Node<T>{
		Node<T> left;
		T data;
		Node<T> right;
		
		public Node(T data) {
			this.left = null;
			this.data = data;
			this.right = null;
		}
		
		public Node(Node<T> left, T data, Node<T> right) {
			this.left = left;
			this.data = data;
			this.right = right;
		}
	}
	
	void insert(T element);
	T delete(T element);
	boolean exists(T element);

	
	
}
