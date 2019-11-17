package exercise.LeetCode;

public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length-1);
    }
    public TreeNode dfs(int[] nums, int left, int right) {
        if(left > right) return null;
        int mid = (left+right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = dfs(nums, left, mid-1);
        root.right = dfs(nums, mid+1, right);
        return root;
    }

}