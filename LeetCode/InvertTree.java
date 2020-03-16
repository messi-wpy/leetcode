package exercise.LeetCode;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        invertHelp(root);
        return root;
    }

    public void invertHelp(TreeNode root) {
        if (root == null)
            return;
        invertHelp(root.left);
        invertHelp(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;


    }

}