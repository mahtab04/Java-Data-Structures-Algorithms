package binarytree;

import java.util.*;

public class RootToNodePath {
    public static ArrayList<Integer> rootToNodePath(BinaryTreeNode<Integer> root, int target) {

        if (root == null)
            return null;
        if (root.data == target) {
            ArrayList<Integer> path = new ArrayList<Integer>();
            path.add(root.data);
            return path;

        }

        ArrayList<Integer> leftPath = rootToNodePath(root.left, target);
        if (leftPath != null) {
            leftPath.add(root.data);
            return leftPath;
        }
        ArrayList<Integer> rightPath = rootToNodePath(root.right, target);
        if (rightPath != null) {
            rightPath.add(root.data);
            return rightPath;
        }
        return null;
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
        ArrayList<Integer> path = rootToNodePath(root, 15);
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
    }
}
