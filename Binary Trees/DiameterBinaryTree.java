package binarytree;

public class DiameterBinaryTree {
	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(height(root.left), height(root.right));
	}

	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
		if(root==null)
			return 0;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		int leftDiameter = diameterOfBinaryTree(root.left);
		int rightDiameter = diameterOfBinaryTree(root.right);
		if (leftHeight == rightHeight)
			return leftHeight + rightHeight+1;
		else
			return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
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
		System.out.println(diameterOfBinaryTree(root));
	

	}

}
