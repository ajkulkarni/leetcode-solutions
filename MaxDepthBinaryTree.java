/**
 *
 * @author Ajay
 */

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


    public int maxDepth(TreeNode root) {

        int left = 0, right =0;

        if (root==null)
        return 0;

        else {
            left = 1 + maxDepth(root.left);
            right = 1 + maxDepth(root.right);

            if(left>right)
                return left;

            else
                return right;
        }


    }
}
