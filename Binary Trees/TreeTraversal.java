package binarytree;

public class TreeTraversal {
	public static void preOrderTravelsal(BinaryTreeNode<Integer> root) {

		if (root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrderTravelsal(root.left);
		preOrderTravelsal(root.right);

	}

	public static void inOrderTravelsal(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		inOrderTravelsal(root.left);
		System.out.print(root.data+" ");
		inOrderTravelsal(root.right);
	}

	public static void postOrderTravelsal(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		postOrderTravelsal(root.left);
		postOrderTravelsal(root.right);
		System.out.print(root.data+" ");
	}

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
		root.left = new BinaryTreeNode<Integer>(2);
		root.right = new BinaryTreeNode<Integer>(3);
		root.left.left = new BinaryTreeNode<Integer>(4);
		root.left.right = new BinaryTreeNode<Integer>(5);
		root.right.left = new BinaryTreeNode<Integer>(6);
		root.right.right = new BinaryTreeNode<Integer>(7);
		System.out.println("Preorder Traversal: ");
		preOrderTravelsal(root);
		System.out.println("\nInorder Travesal: ");
		inOrderTravelsal(root);
		System.out.println("\nPostorder Traversal: ");
		postOrderTravelsal(root);
	}

}
