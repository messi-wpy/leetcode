package exercise.SwordRefersToOffer;


import exercise.LeetCode.ListNode;

/**
 * 《剑指offer》
 *   24反转链表
 *
 *
 */
public class ReverseList {

    public ListNode ReverseList(ListNode head) {
        ListNode node =head;
        ListNode res=null;
        ListNode pre=null;
        while (node!=null){
            ListNode next=node.next;

            if (node.next==null){
                res=node;
            }
            node.next=pre;
            pre=node;
            node=next;
        }
        return res;
    }
}
