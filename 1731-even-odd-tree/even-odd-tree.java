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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int len = 0;
        int prev = 0;
        boolean flag = false;
        TreeNode node;
        int val = 0;
        while(!queue.isEmpty()){
            flag = !flag;
            prev = flag?0:Integer.MAX_VALUE;
            len = queue.size();
            for(int i = 0;i<len;i++){
                node = queue.poll();
                val = node.val;
                if(flag){
                    if(!(val % 2== 1 && prev < val))
                    return false;
                    prev = val;
                }else{
                    if(!(node.val % 2== 0 && prev > node.val))
                    return false;
                    prev = val;
                }
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
        }
        return true;
    }
}