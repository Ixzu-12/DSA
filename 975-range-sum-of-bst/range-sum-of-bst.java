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
    public void range(TreeNode root,int x,int y,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        if(x<=root.val&&y>=root.val){
            range(root.left,x,y,list);
            list.add(root.val);
            range(root.right,x,y,list);

        }
        else if(root.val>=y){
            range(root.left,x,y,list);

        }
        else{
            range(root.right,x,y,list);
        }

    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        range(root,low,high,list);
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);

        }
        return sum;

        
    }
}