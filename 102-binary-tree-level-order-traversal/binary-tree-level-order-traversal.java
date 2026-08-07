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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> que=new LinkedList<>();
        List<List<Integer>> ls=new LinkedList<>();
        if(root==null){
            return ls;
        }
        que.offer(root);
        while(!que.isEmpty()){
            int levelnum=que.size();
            List<Integer> newls=new LinkedList<>();
            for(int i=0;i<levelnum;i++){
                if(que.peek().left!=null) que.offer(que.peek().left);
                if(que.peek().right!=null) que.offer(que.peek().right);
                newls.add(que.poll().val);
            }
            ls.add(newls);
        }
        return ls;
    }
}