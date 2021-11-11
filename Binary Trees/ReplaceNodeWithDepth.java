package binarytree;

public class ReplaceNodeWithDepth {
	public static void replaceNodeWithDepth(BinaryTreeNode<Integer> root, int k) {
		if (root == null)
			return;
		root.data = k;
		replaceNodeWithDepth(root.left, k + 1);
		replaceNodeWithDepth(root.right, k + 1);

	}

	// print tree
	public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		printTree(root.left);
		printTree(root.right);
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
		root.left = new BinaryTreeNode<Integer>(2);
		root.right = new BinaryTreeNode<Integer>(3);
		root.left.left = new BinaryTreeNode<Integer>(4);
		root.left.right = new BinaryTreeNode<Integer>(5);
		root.right.left = new BinaryTreeNode<Integer>(6);
		root.right.right = new BinaryTreeNode<Integer>(7);
		root.left.left.left = new BinaryTreeNode<Integer>(8);
		root.left.left.right = new BinaryTreeNode<Integer>(9);
		root.left.right.left = new BinaryTreeNode<Integer>(10);
		root.left.right.right = new BinaryTreeNode<Integer>(11);
		root.right.left.left = new BinaryTreeNode<Integer>(12);
		root.right.left.right = new BinaryTreeNode<Integer>(13);
		root.right.right.left = new BinaryTreeNode<Integer>(14);
		root.right.right.right = new BinaryTreeNode<Integer>(15);
		replaceNodeWithDepth(root, 0);
		printTree(root);

	}

}
