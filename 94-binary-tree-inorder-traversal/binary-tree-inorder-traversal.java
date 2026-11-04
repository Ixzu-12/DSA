import java.util.List;
import java.util.ArrayList;
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
    // public void inorder(TreeNode root,List<Integer> result){
    //     if(root==null){
    //         return;
    //     }
    //     inorder(root.left,result);
    //     result.add(root.val);
    //     inorder(root.right,result);



    // }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        TreeNode curr=root;
        while(curr!=null){
            if(curr.left==null){
                result.add(curr.val);
                curr=curr.right;
            }
            else{
                TreeNode leftC=curr.left;
                while(leftC.right!=null){
                    leftC=leftC.right;
                }
                leftC.right=curr;
                TreeNode temp=curr;
                curr=curr.left;
                temp.left=null;
            }
        }
        return result;
       
       
        
    }
}