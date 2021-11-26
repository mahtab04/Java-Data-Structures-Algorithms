package binarytree;

import java.util.*;

public class LevelorderTraversal {
	public static void printLevelOrder(BinaryTreeNode<Integer> root) {
		Queue<BinaryTreeNode<Integer>> queue = new ArrayDeque<BinaryTreeNode<Integer>>();
		queue.add(root);
		while (queue.size() > 0) {
			int count = queue.size();
			for (int i = 0; i < count; i++) {
				BinaryTreeNode<Integer> node = queue.poll();
				System.out.print(node.data + " ");
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
			System.out.println();
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
		printLevelOrder(root);
	}
}
