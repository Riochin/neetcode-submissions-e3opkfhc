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

// 問題文要約: 二つのp,qに共通する先祖をreturn
// 二つのノードを同時に走査？

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode findP = root;
        TreeNode findQ = root;
        TreeNode res = null;

        while((findP != null && findQ != null)){
            if(findP.val==p.val && findQ.val == q.val) break;
            System.out.println("checking" + findP.val + "," + findQ.val);

            if(findP.val == findQ.val) res = findP;

            if(findP.val < p.val) findP = findP.right;
            else if(findP.val > p.val) findP = findP.left;
            if(findQ.val < q.val) findQ = findQ.right;
            else if(findQ.val > q.val) findQ = findQ.left;
        }
        
        return res;
    }
}
