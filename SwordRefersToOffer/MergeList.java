package exercise.SwordRefersToOffer;

import exercise.LeetCode.ListNode;

public class MergeList {

    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode head=new ListNode(-1);
        ListNode next=head;
        while (list1!=null||list2!=null){
            if (list1==null){
                next.next=list2;
                break;
            }
            if (list2==null){
                next.next=list1;
                break;
            }
            if (list1.val<= list2.val){
                next.next=list1;
                next=next.next;
                list1=list1.next;
            }
            else {
                next.next=list2;
                next=next.next;
                list2= list2.next;
            }


        }
        return head.next;
    }
}
