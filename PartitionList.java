package leetcode;

public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        ListNode first,second;
        ListNode temp=new ListNode(0);
        temp.next=head;
        first=second=temp;
        while (first.next!=null&&first.next.val<x){
            first=first.next;
        }
        second=first.next;

        while (second!=null&&second.next!=null){
            if (second.next.val>=x){
                second=second.next;
                continue;
            }
            ListNode temp1=first.next;
            first.next=second.next;
            second.next=second.next.next;
            first.next.next=temp1;
            first=first.next;
        }
        return temp.next;
    }
}
