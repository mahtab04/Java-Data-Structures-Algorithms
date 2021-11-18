package binarytree;

import java.util.*;

public class InsertDuplicateNode {
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>(root.data);
		BinaryTreeNode<Integer> save = root.left;
		root.left = temp;
		root.left.left = save;

		insertDuplicateNode(save);
		insertDuplicateNode(root.right);

	}

	// print tree level order
	public static void printTreeLevel(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryTreeNode<Integer> temp = queue.poll();
			System.out.print(temp.data + " ");
			if (temp.left != null) {
				queue.add(temp.left);
			}
			if (temp.right != null) {
				queue.add(temp.right);
			}
		}
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
		insertDuplicateNode(root);
		System.out.println("Level order traversal of the tree is: ");
		printTreeLevel(root);

	}

}
