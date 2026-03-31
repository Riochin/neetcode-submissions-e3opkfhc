// Binary Tree Level Order Traversal
// 🔗https://neetcode.io/problems/level-order-traversal-of-binary-tree?list=blind75

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

/*
* <BFSで求める作戦>
*
*
*/

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);        
        
        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();

            for(int i=queue.size(); i>0 ; i--){
                TreeNode node = queue.poll();
                if(node == null) continue;

                level.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
            
            if(level.size() > 0){
                 ans.add(level);
            }
        }

        return ans;
    }
}
