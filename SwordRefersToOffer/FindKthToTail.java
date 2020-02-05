package exercise.SwordRefersToOffer;

import exercise.LeetCode.ListNode;

public class FindKthToTail {

    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode first,second;
        first=second=head;
        int temp=0;
        while (temp<k-1&&second!=null){
            temp++;
            second=second.next;
        }
        if (temp!=k-1||second==null){
            return null;
        }
        while (second.next!=null){
            second=second.next;
            first=first.next;
        }
        return first;
    }
}
