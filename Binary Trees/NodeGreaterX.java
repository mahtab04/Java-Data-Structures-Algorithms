package binarytree;

public class NodeGreaterX {
	public static int NodesGreaterX(BinaryTreeNode<Integer> root, int x) {
		if (root == null)
			return 0;
		if (root.data > x)
			return 1 + NodesGreaterX(root.left, x) + NodesGreaterX(root.right, x);
		else
			return NodesGreaterX(root.left, x) + NodesGreaterX(root.right, x);

	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(10);
		root.left = new BinaryTreeNode<Integer>(5);
		root.right = new BinaryTreeNode<Integer>(15);
		root.left.left = new BinaryTreeNode<Integer>(2);
		root.left.right = new BinaryTreeNode<Integer>(7);
		root.right.left = new BinaryTreeNode<Integer>(12);
		root.right.right = new BinaryTreeNode<Integer>(18);
		System.out.println(NodesGreaterX(root, 10));

	}

}
