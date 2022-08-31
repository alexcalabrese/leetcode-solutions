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

// Iterative
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {  
        while(root != null){
            if(root.val == val) return root;
            
            root = val > root.val ? root.right : root.left;
        }
        
        return root;
    }
}

/* 
Recursive
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null || root.val == val) return root;
        
        if(val > root.val)
            return searchBST(root.right, val);
        else
            return searchBST(root.left, val);
    }
}
*/