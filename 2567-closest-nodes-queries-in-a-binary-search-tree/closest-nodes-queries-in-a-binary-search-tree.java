import java.util.ArrayList;
import java.util.List;
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
    public void inorder(TreeNode root,List<Integer>list){
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);

    }
    public int lower(List<Integer> list,int q){
        int ans=-1,l=0,h=list.size()-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(list.get(mid)<=q){
                ans=Math.max(ans,list.get(mid));
                l=mid+1;

            }
            else{
                h=mid-1;
            }

        }
        return ans;
    }
    public int upper(List<Integer> list,int q){
        int ans=Integer.MAX_VALUE;
        int l=0;
        int h=list.size()-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(list.get(mid)>=q){
                ans=Math.min(ans,list.get(mid));
                h=mid-1;

            }
            else{
                l=mid+1;
            }


                    }
                    if(ans==Integer.MAX_VALUE){
                        return -1;

                    }
                    return ans;
    }

    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<Integer> listB=new ArrayList<>();
        inorder(root,listB);
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<queries.size();i++){
            List<Integer> li=new ArrayList<>();
            int low=lower(listB,queries.get(i));
            int high=upper(listB,queries.get(i));
            li.add(low);
            li.add(high);
            result.add(li);

        }
        return result;




       


        
    }
}