/*
Given the root of a binary tree, return the length of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
This path may or may not pass through the root.
The length of a path between two nodes is represented by the number of edges between them.

Example 1:
Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].

Example 2:
Input: root = [1,2]
Output: 1
*/

public class DiameterOfBinaryTree {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
    System.out.println(diameterOfBinaryTree(root));
  }

  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  public static int diameterOfBinaryTree(TreeNode root) {
    return dfs(root)[1];
  }

  public static int[] dfs(TreeNode root) {
    if (root == null) {
      return new int[]{0, 0};
    }
    int[] left = dfs(root.left);
    int[] right = dfs(root.right);
    int height = Math.max(left[0], right[0]) + 1;
    int diameter = Math.max(left[1], Math.max(right[1], left[0] + right[0]));
    return new int[]{height, diameter};
  }

}
