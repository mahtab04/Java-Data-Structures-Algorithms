package binarytree;

public class InorderPreorderTreeCons {

	//construct tree from preorder and inorder traversal
	public static BinaryTreeNode<Integer> buildTreeHelperFromPreIn(int pre[], int in[], int siPre, int eiPre, int siIn,
			int eiIn) {

		if (siPre > eiPre) {
			return null;
		}
		int rootData = pre[siPre];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		int rootIndex = -1;
		for(int i = siIn;i<=eiIn;i++) {
			if(in[i] == rootData) {
				rootIndex = i;
				break;
			}
		}
		int siPreleft = siPre + 1;
		int siInLeft = siIn;
		
		int eiInLeft = rootIndex - 1;
		
		int siInRight = rootIndex + 1;
		int eiPreRight = eiPre;
		int eiInRight = eiIn;

		int leftSubTreeSize = eiInLeft - siInLeft + 1;
		
		int eiPreleft=siPreleft+leftSubTreeSize-1;
		int siPreRight=eiPreleft+1;
	BinaryTreeNode<Integer>left=buildTreeHelperFromPreIn(pre, in, siPreleft, eiPreleft, siInLeft, eiInLeft);
	BinaryTreeNode<Integer>right=buildTreeHelperFromPreIn(pre, in, siPreRight, eiPreRight, siInRight, eiInRight);
	root.left = left;
	root.right = right;
	return root;
	
			}

	public static BinaryTreeNode<Integer> buildTreeFromPreIn(int pre[], int in[]) {
		BinaryTreeNode<Integer> root = buildTreeHelperFromPreIn(pre, in, 0, pre.length - 1, 0, in.length - 1);
		return root;
	}

	public static void printpreorder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		printpreorder(root.left);
		printpreorder(root.right);
	}

	public static void main(String[] args) {
		int pre[] = { 1, 2, 4, 5, 3, 6, 7 };
		int in[] = { 4, 2, 5, 1, 6, 3, 7 };
		BinaryTreeNode<Integer> root = buildTreeFromPreIn(pre, in);
		System.out.println("Preorder traversal of the constructed tree is ");
		printpreorder(root);
	}
}

	//inorder+preorder
	