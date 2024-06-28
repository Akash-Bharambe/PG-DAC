package day6.tree;

public class TreeTester {

	public static void main(String[] args) {
		
		Tree<Integer> tree = new TreeImpl<Integer>(10);
		
		tree.insert(5);
		tree.insert(3);
		tree.insert(2);
		tree.insert(6);
		tree.insert(7);
		tree.insert(1);
		tree.insert(12);

//		System.out.print("Inorder: ");
//		tree.inOrder();
//		System.out.println();
//		System.out.print("Postorder: ");
//		tree.postOrder();
//		System.out.println();
//		System.out.print("Preorder: ");
//		tree.preOrder();
//		System.out.println();
//		System.out.println("Count Nodes: "+tree.countNodes());
//		System.out.println("Count Leaf Nodes: "+tree.countLeafNodes());
		
//		tree.levelOrder();
		
		System.out.println(tree.height());
		
	}

}
