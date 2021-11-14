//https://leetcode.com/problems/deepest-leaves-sum/
package leetcode;

class TreeNode {
    
      TreeNode left;
      TreeNode right;
      int val;
  public TreeNode(int val) {
      this.val = val;
  }
  
}
public class DeepestLeavesSum {

    public static  int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static int deepestLeavesSum(TreeNode root) {
        int h = height(root);
        return helper(root, h);
    }

    private static int helper(TreeNode root, int h) {
        if (root == null) {
            return 0;
        }
        if (h == 1) {
            return root.val;
        }
        return helper(root.left, h - 1) + helper(root.right, h - 1);
       }
    

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(8);
        root.left.left.left = new TreeNode(7);
        System.out.println(deepestLeavesSum(root));
        
    }
}
