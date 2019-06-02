package leetcode;

public class RemoveDuplicatesFromSortedListII {

    public ListNode deleteDuplicates(ListNode head) {
        if (head==null)return null;
        ListNode headp=new ListNode(-1) ;
        headp.next=head;
        ListNode first=headp;
        ListNode second=first.next.next;
        while (second!=null) {
            if (first.next.val!=second.val){
                first=first.next;
                second=second.next;
                continue;
            }
            while (second != null && first.next.val == second.val) {
                second=second.next;

            }
            first.next=second;

            if (second==null)
                break;
            second=second.next;
        }

        return headp.next;
    }
}
