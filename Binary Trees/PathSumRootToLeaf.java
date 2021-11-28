package binarytree;

public class PathSumRootToLeaf {
	//root to leaf path sum k

	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k, String result) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			if (root.data == k) {
				System.out.print(result + root.data + " ");
			}

		}

		rootToLeafPathsSumToK(root.left, k - root.data, result + root.data + " ");
		rootToLeafPathsSumToK(root.right, k - root.data, result + root.data + " ");
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
		String str ="";
		rootToLeafPathsSumToK(root, 16,str);
	}

}

