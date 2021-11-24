package binarytree;

public class NodeWithoutSiblings {

	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {

		if (root == null)
			return;

		if ((root.left == null && root.right != null) || (root.left != null && root.right == null)) {
			if (root.left != null) {
				System.out.print(root.left.data + " ");
			} else {
				System.out.print(root.right.data + " ");
			}
		}

		printNodesWithoutSibling(root.left);
		printNodesWithoutSibling(root.right);
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
		root.left = new BinaryTreeNode<Integer>(2);
		root.right = new BinaryTreeNode<Integer>(3);
		root.left.left = new BinaryTreeNode<Integer>(4);
		root.left.right = new BinaryTreeNode<Integer>(5);
		printNodesWithoutSibling(root);

	}

}
