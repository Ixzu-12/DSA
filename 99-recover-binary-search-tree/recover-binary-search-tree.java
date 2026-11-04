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
    public void inorder(TreeNode root,ArrayList<TreeNode> list){
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root);
        inorder(root.right,list);
        
    }
    public void recoverTree(TreeNode root) {
        ArrayList<TreeNode> list=new ArrayList<>();
        inorder(root,list);
        TreeNode first=null,middle=null,last=null;
        
        for(int i=1;i<list.size();i++){
            if(list.get(i).val<list.get(i-1).val){
                if(first==null){
                    first=list.get(i-1);
                    middle=list.get(i);
                }
                else{
                    last=list.get(i);
                }
            }


        }
        if(last!=null){
            int temp=first.val;
            first.val=last.val;
            last.val=temp;
        }
        else{
            int temp=first.val;
            first.val=middle.val;
            middle.val=temp;
        }

       
        
    }
}