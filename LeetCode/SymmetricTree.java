package exercise.LeetCode;

public class SymmetricTree {
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public boolean isSymmetric(TreeNode root) {
        if (root==null)return true;
        return checkMirror(root.left,root.right);
    }

    public boolean checkMirror(TreeNode tree_1,TreeNode tree_2){

        if (tree_1!=null&&tree_2!=null){
            if (tree_1.val==tree_2.val) {
                boolean out = false;
                boolean in = false;
                out = checkMirror(tree_1.left, tree_2.right);
                in = checkMirror(tree_1.right, tree_2.left);
                return out&&in;
            }
            else
                return false;

        }
        else
            return tree_1==null&&tree_2==null;

    }
}
