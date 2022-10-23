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
    public int closestValue(TreeNode root, double target) {
        boolean found = false;
        int ans = -1;
        double mainDiff = Double.MAX_VALUE;
        
        while(root != null){
            double currDiff = target - root.val;
            
            if(Math.abs(currDiff) < Math.abs(mainDiff)){
                ans = root.val;
                mainDiff = currDiff;
            }
            
            if(currDiff < 0)
                root = root.left;
            else if(currDiff > 0)
                root = root.right;
            else
                return root.val;
        }
        return ans;
    }
}