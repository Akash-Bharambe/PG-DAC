package day6.tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TreeImpl<T extends Comparable<T>> implements Tree<T> {

	private Node<T> root;

	public TreeImpl() {
		root = null;
	}

	public TreeImpl(T root) {
		this.root = new Node<>(root);
	}

	@Override
	public Iterator<Node<T>> iterator() {
//		// TODO Auto-generated method stub
//		return new Iterator<Tree.Node<T>>() {
//			private Node<T> current = root;
//
//			@Override
//			public boolean hasNext() {
//				return current.right;
//			}
//
//			@Override
//			public Node<T> next() {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		};
		return null;
	}

	@Override
	public void insert(T element) {

		if (root == null) {
			root = new Node<>(element);
			return;
		}
		insert(root, element);
	}

	private void insert(Node<T> current, T element) {

		if (current.data.equals(element)) {
			return;
		} else if (current.data.compareTo(element) > 0) {
			if (current.left != null) {
				insert(current.left, element);
			} else {
				current.left = new Node<>(element);
			}
		} else if (current.data.compareTo(element) < 0) {
			if (current.right != null) {
				insert(current.right, element);
			} else {
				current.right = new Node<>(element);
			}
		}

	}

	@Override
	public T delete(T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(T element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(Node<T> current) {
		if (current == null) {
			return;
		}
		System.out.print(current + " ");
		if (current.left != null) {
			preOrder(current.left);
		}
		if (current.right != null) {
			preOrder(current.right);
		}
	}

	@Override
	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(Node<T> current) {
		if (current == null) {
			return;
		}
		if (current.left != null) {
			postOrder(current.left);
		}
		if (current.right != null) {
			postOrder(current.right);
		}
		System.out.print(current + " ");
	}

	@Override
	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(Node<T> current) {
		if (current == null) {
			return;
		}
		if (current.left != null) {
			inOrder(current.left);
		}
		System.out.print(current + " ");
		if (current.right != null) {
			inOrder(current.right);
		}
	}

	@Override
	public int countNodes() {
		return countNodes(root);
	}

	private int countNodes(Node<T> current) {
		if (current == null) {
			return 0;
		}
		int count = 1;
		if (current.left != null) {
			count += countNodes(current.left);
		}
		if (current.right != null) {
			count += countNodes(current.right);
		}
		return count;
	}

	@Override
	public int countLeafNodes() {
		return countLeafNodes(root);
	}

	private int countLeafNodes(Node<T> current) {
		if (current == null) {
			return 0;
		}
		if (current.left == null && current.right == null) {
			return 1;
		}
		return countLeafNodes(current.left) + countLeafNodes(current.right);
	}

	@Override
	public int countNodesWithValue(int value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void levelOrder() {
		Queue<Node<T>> queue = new LinkedList<>();
		if (root == null) {
			return;
		}
		queue.add(root);
		queue.add(null);
		while (!queue.isEmpty()) {
			Node<T> t = queue.remove();
			if (t == null) {
				System.out.println();
				if (queue.isEmpty()) {
					break;
				} else {
					queue.add(null);
				}
			} else {
				System.out.print(t + " ");
				if (t.left != null) {
					queue.add(t.left);
				}
				if (t.right != null) {
					queue.add(t.right);
				}
			}
		}
	}

	@Override
	public int height() {
		return height(root);
	}
	
	private int height(Node<T> current) {
		if (current == null) {
			return 0;
		}
		if (current.left == null && current.right == null) {
			return 0;
		}
		
		return 1+ Math.max(height(current.left), height(current.right));
	}

}
