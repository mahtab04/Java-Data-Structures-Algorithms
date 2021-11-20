package binarytree;

public class MirrorBinaryTree {
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;
		BinaryTreeNode<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;
		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);
	

}

public static void printPreorder(BinaryTreeNode<Integer> root) {
	if (root == null)
		return;
	System.out.print(root.data + " ");
	printPreorder(root.left);
	printPreorder(root.right);
}

public static void main(String[] args) {
		
	BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
	root.left = new BinaryTreeNode<Integer>(2);
	root.right = new BinaryTreeNode<Integer>(3);
	root.left.left = new BinaryTreeNode<Integer>(4);
	root.left.right = new BinaryTreeNode<Integer>(5);
	root.right.left = new BinaryTreeNode<Integer>(6);
	root.right.right = new BinaryTreeNode<Integer>(7);
	mirrorBinaryTree(root);
	printPreorder(root);
	
		

	}

}
