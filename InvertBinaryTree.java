/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {

        if(root==null)
        {
            return root;
        }

        if(root.left!=null && root.right!=null) {
            invertTree(root.left);
            invertTree(root.right);
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            return root;
        }

        if(root.left!=null && root.right==null) {
            root.right= root.left;
            root.left=null;
            invertTree(root.right);
            return root;
        }

        if(root.left==null && root.right!=null) {
            root.left= root.right;
            root.right=null;
            invertTree(root.left);
            return root;
        }

        if(root.left==null && root.right==null) {
            return root;
        }


        return invertTree(root);
    }
}
