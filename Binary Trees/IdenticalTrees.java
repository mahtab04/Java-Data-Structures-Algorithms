package binarytree;

public class IdenticalTrees {
    public static boolean isIdentical(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
        if (root1.data != root2.data)
            return false;
        return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root1 = new BinaryTreeNode<Integer>(1);
        root1.left = new BinaryTreeNode<Integer>(2);
        root1.right = new BinaryTreeNode<Integer>(3);
        root1.left.left = new BinaryTreeNode<Integer>(4);
        root1.left.right = new BinaryTreeNode<Integer>(5);
        root1.right.left = new BinaryTreeNode<Integer>(6);
        root1.right.right = new BinaryTreeNode<Integer>(7);

        BinaryTreeNode<Integer> root2 = new BinaryTreeNode<Integer>(1);
        root2.left = new BinaryTreeNode<Integer>(2);
        root2.right = new BinaryTreeNode<Integer>(3);
        root2.left.left = new BinaryTreeNode<Integer>(4);
        root2.left.right = new BinaryTreeNode<Integer>(5);
        root2.right.left = new BinaryTreeNode<Integer>(6);
        root2.right.right = new BinaryTreeNode<Integer>(7);
        System.out.println(isIdentical(root1, root2));

    }
}
