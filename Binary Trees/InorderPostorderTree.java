package binarytree;

public class InorderPostorderTree {
	//construct tree using inorder and postorder
	public static BinaryTreeNode<Integer> constructTree(int[] postOrder, int[] inOrder) {
		if (postOrder == null || inOrder == null || postOrder.length == 0 || inOrder.length == 0) {
			return null;
		}
		return constructTree(postOrder, 0, postOrder.length - 1, inOrder, 0, inOrder.length - 1);
	}

	private static BinaryTreeNode<Integer> constructTree(int[] postOrder, int postStart, int postEnd, int[] inOrder,
			int inStart, int inEnd) {
		if (postStart > postEnd || inStart > inEnd) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(postOrder[postEnd]);
		int rootIndex = 0;
		for (int i = inStart; i <= inEnd; i++) {
			if (inOrder[i] == postOrder[postEnd]) {
				rootIndex = i;
				break;
			}
		}
		int leftLength = rootIndex - inStart;
		root.left = constructTree(postOrder, postStart, postStart + leftLength - 1, inOrder, inStart, rootIndex - 1);
		root.right = constructTree(postOrder, postStart + leftLength, postEnd - 1, inOrder, rootIndex + 1, inEnd);
		return root;
	
	}
	//preorder printing
	public static void printpreorder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		printpreorder(root.left);
		printpreorder(root.right);
	}
	public static void main(String[] args) {
		int[] post = { 4,5,2,6,7,3,1 };
		int [] in ={ 4,2,5,1,6,3,7};
		BinaryTreeNode<Integer> root = constructTree(post, in);
		printpreorder(root);
	

	}

}
