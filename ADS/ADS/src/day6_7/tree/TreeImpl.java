package day6_7.tree;

import java.util.Arrays;
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
		return new Iterator<Tree.Node<T>>() {
			private Queue<Node<T>> queue = new LinkedList<Tree.Node<T>>(Arrays.asList(root));
			
			@Override
			public boolean hasNext() {
				return !queue.isEmpty();
			}

			@Override
			public Node<T> next() {
				Node<T> node = queue.remove();
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
				return node;
			}
		};
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
		Node<T> parentNode = null;
		Node<T> currNode = root;
		T value = null;

		while (currNode != null) {
			if (currNode.data.equals(element)) {
				break;
			}
			parentNode = currNode;
			if (element.compareTo(currNode.data) < 0) {
				currNode = currNode.left;
			} else {
				currNode = currNode.right;
			}
		}
		if (currNode == null) {
			return value;
		}

		value = currNode.data;

		// Deleting Lead Node
		if (currNode.left == null && currNode.right == null) {
			if (currNode == root) {
				root = null;
			} else if (parentNode.left == currNode) {
				parentNode.left = null;
			} else {
				parentNode.right = null;
			}
			return value;
		}

		// If current have only one node
		if (currNode.left == null || currNode.right == null) {

			Node<T> childNode = (currNode.left != null) ? currNode.left : currNode.right;
			if (currNode == root) {
				root = childNode;
			} else if (parentNode.left == currNode) {
				parentNode.left = childNode;
			} else {
				parentNode.right = childNode;
			}
			return value;
		}

		// If current have 2 nodes
		Node<T> inOrderSuccessorParent = currNode;
		Node<T> inOrderSuccessor = currNode.right;

		while (inOrderSuccessor.left != null) {
			inOrderSuccessorParent = inOrderSuccessor;
			inOrderSuccessor = inOrderSuccessor.left;
		}

		currNode.data  = inOrderSuccessor.data;

		if (inOrderSuccessor == inOrderSuccessorParent.left) {
			inOrderSuccessorParent.left = inOrderSuccessor.right;
		} else {
			inOrderSuccessorParent.right = inOrderSuccessor.right;
		}

		return value;
	}

	@Override
	public boolean exists(T element) {
		return exists(root, element);
	}

	private boolean exists(Node<T> current, T element) {
		if (current.data.equals(element)) {
			return true;
		}
		if (current.left != null) {
			return exists(current.left, element);
		}
		if (current.right != null) {
			return exists(current.right, element);
		}
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
		return countNodesWithValue(root, value);
	}

	private int countNodesWithValue(Node<T> current, int value) {
		if (current == null) {
			return 0;
		}
		int count = 0;
		if (current.data.equals(value)) {
			return 1;
		}
		if (current.left != null) {
			count += countNodesWithValue(current.left, value);
		}
		if (current.right != null) {
			count += countNodesWithValue(current.right, value);
		}
		return count;
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

		return 1 + Math.max(height(current.left), height(current.right));
	}

	@Override
	public T findLargest() {
		Node<T> current = root;
		while (current.right != null) {
			current = current.right;
		}
		return current.data;
	}

	@Override
	public T findSmallest() {
		Node<T> current = root;
		while (current.left != null) {
			current = current.left;
		}
		return current.data;
	}

}
