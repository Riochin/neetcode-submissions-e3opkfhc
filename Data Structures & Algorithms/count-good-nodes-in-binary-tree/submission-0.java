/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int goodNodes(TreeNode root) {
        return findGoodNodes(root, -101);
    }

    public int findGoodNodes(TreeNode root, int max){
        if (root == null) return 0;
        if (max <= root.val){
            System.out.println(root.val + "is replace the max val:" + max);
            return (findGoodNodes(root.left, root.val)+findGoodNodes(root.right, root.val)) +1;
        } else {
            System.out.println(root.val + "is not max");
            return findGoodNodes(root.left, max)+findGoodNodes(root.right, max);
        }
    }
}
