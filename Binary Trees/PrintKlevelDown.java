package binarytree;

public class PrintKlevelDown {
    public static void printKlevelDown(BinaryTreeNode<Integer> root, int k) {
        if (root == null)
            return;
        if (k == 0) {
            System.out.println(root.data);
            return;
        }
        printKlevelDown(root.left, k - 1);
        printKlevelDown(root.right, k - 1);

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
        root.left.left.left.left = new BinaryTreeNode<Integer>(16);

        printKlevelDown(root, 3);

    }
}
