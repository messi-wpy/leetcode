package leetcode;

public class ConvertSortedListtoBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        if (head==null)return null;
        if (head.next==null)return new TreeNode(head.val);
        return help(head,null);
    }

    public TreeNode help(ListNode head,ListNode tail){
        if (head==tail)return null;
        ListNode slow=head;
        ListNode fast=head;
        while (fast.next!=tail&&fast.next.next!=tail){
            slow=slow.next;
            fast=fast.next.next;

        }
        TreeNode tree=new TreeNode(slow.val);
        tree.left=help(head,slow);
        tree.right=help(slow.next,tail);
        return tree;
    }
}
