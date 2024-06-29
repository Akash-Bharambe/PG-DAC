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

		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
		System.out.println();
	}

	public static void main(String[] args) {
		int nodes[] = { 10, 5, 12, -1, -1, 3, 6, -1, -1, 2, 7, -1, -1, 1, -1, -1 };
//		int nodes[] = { 1, 2, 3, 5, 6, 10, 7, 12 };
		Node node = BinaryTree.buildTree(nodes);

		inOrder(node);
	}

}
