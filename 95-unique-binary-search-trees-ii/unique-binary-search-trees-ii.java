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
    public List<TreeNode> solve(int start,int end){
        List<TreeNode> result=new ArrayList<>();
        if(start>end){
            result.add(null);
            return result;}
        
        if(start==end){
           TreeNode root=new TreeNode(start);
           result.add(root);
           return result;}
           
        for(int i=start;i<=end;i++){
            // get left side elements
           List<TreeNode> leftbst= solve(start,i-1);
        //    get right side elements
           List<TreeNode> rightbst=solve(i+1,end);
           for(TreeNode leftroot: leftbst){
            for(TreeNode rightroot: rightbst){
                // make every n root
                TreeNode root=new TreeNode(i);
                // left side
                root.left=leftroot;
                // right side
                root.right=rightroot;
                // add the root to result so it can check all the unique bsts
                result.add(root);
            }
           }

        }
        // return the list of TreeNodes root
        return result;}
    

    public List<TreeNode> generateTrees(int n) {
        return solve(1,n);
        

        
        
    }
}