package day6.tree;

public interface Tree<T extends Comparable<T>> extends Iterable<Tree.Node<T>> {

	class Node<T> {
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

		@Override
		public String toString() {
			return data + "";
		}

	}

	void insert(T element);

	T delete(T element);

	boolean exists(T element);

	void preOrder();

	void postOrder();

	void inOrder();
	
	void levelOrder();

	int countNodes();

	int countLeafNodes();

	int countNodesWithValue(int value);
	
	int height();

}
