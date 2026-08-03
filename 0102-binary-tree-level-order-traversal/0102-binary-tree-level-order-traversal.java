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
import java.util.*;
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
          List<List<Integer>> lst = new ArrayList<>();
          Queue<TreeNode> q = new LinkedList<>();
          if (root == null) return lst;
          q.add(root);
          while(!q.isEmpty()){
              int sz = q.size();
              List<Integer> nd = new ArrayList<>();
              for( int i =0 ; i < sz ;i++){
                  
                  TreeNode ok =q.poll();
                  nd.add(ok.val);
                  if(ok.left!=null) q.add(ok.left);
                  if(ok.right!= null) q.add(ok.right);
              }
              lst.add(nd);
          }
          return lst;
                      }
}