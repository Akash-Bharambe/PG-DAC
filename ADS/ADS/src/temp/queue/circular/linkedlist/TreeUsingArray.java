package temp.queue.circular.linkedlist;

public class TreeUsingArray {

	static class BinaryTree {
		static int index = -1;

		public static Node buildTree(int[] nodes) {
			index++;

			if (index < nodes.length) {
				if (nodes[index] == -1) {
					return null;
				}
//				System.out.println(index);
				Node newNode = new Node(nodes[index]);
				newNode.left = buildTree(nodes);
				newNode.right = buildTree(nodes);
				return newNode;
			}
			return null;
		}
	}

	public static void inOrder(Node root) {
		if (root == null) {
			return;
		}
//		System.out.println(root);
		inOrder(root.left);
		System.out.println(root.data);
//		inOrder(root.right);
	}

	public static void main(String[] args) {
//		int nodes[] = { 10, 5, 12, -1, -1, 3, 6, -1, -1, 2, 7, -1, -1, 1, -1, -1 };
		int nodes[] = { 1, 2, 3, 5, 6, 10, 7, 12 };
		BinaryTree tree = new BinaryTree();
		Node node = tree.buildTree(nodes);

		inOrder(node);
	}

}
