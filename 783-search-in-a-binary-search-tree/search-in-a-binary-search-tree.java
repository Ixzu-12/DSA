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
    // public boolean search(TreeNode root,int data){
    //     if(root==null){
    //         return false;
    //     }
    //     if(root.val>data){
    //         return search(root.left,data);
    //     }
    //     else if(root.val==data){
    //         return true;
    //     }
    //     else{
    //         return search(root.right,data);
    //     }
    // }
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return null;
        }
        if(root.val>val){
            return searchBST(root.left,val);
        }
        else if(root.val==val){
            return root;
        }
        else{
            return searchBST(root.right,val);
        }
        // return null;
       

        
    }
}