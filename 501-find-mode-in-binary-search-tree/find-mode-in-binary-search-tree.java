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
    private HashMap<Integer,Integer> map =new HashMap<>();
    private ArrayList<Integer> list=new ArrayList<>();
    int maxfreq=0;

    public void inorder(TreeNode root){
        if (root==null) return;
        inorder(root.left);
        int count=map.getOrDefault(root.val,0)+1;
        map.put(root.val,count);
        inorder(root.right);
    }
    
    public int[] findMode(TreeNode root) {
        inorder(root);
        
        for(int key:map.keySet()){
            int max=map.get(key);
            if(map.get(key)>maxfreq){
                maxfreq=max;
                list=new ArrayList<>();
                list.add(key);
            }
            else if(max==maxfreq){
                list.add(key);
            }

        }
        int arr[]= new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
            
        }
        return arr;


        
        
    }
}