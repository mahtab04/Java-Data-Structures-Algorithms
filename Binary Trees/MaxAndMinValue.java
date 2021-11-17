package binarytree;

public class MaxAndMinValue {
    public static int getMax(BinaryTreeNode<Integer> root) {
        if (root == null)
            return Integer.MIN_VALUE;

        int max = root.data;
        int leftMax = getMax(root.left);
        int rightMax = getMax(root.right);
        max = Math.max(max, Math.max(leftMax, rightMax));
        return max;

    }

    public static int getMin(BinaryTreeNode<Integer> root) {
        if (root == null)
            return Integer.MAX_VALUE;

        int min = root.data;
        int leftMin = getMin(root.left);
        int rightMin = getMin(root.right);
        min = Math.min(min, Math.min(leftMin, rightMin));
        return min;

    }

    public static void getMinAndMax(BinaryTreeNode<Integer> root) {
        System.out.println("Max: " + getMax(root));
        System.out.println("Min: " + getMin(root));

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

        getMinAndMax(root);

    }
}
