package exercise.SwordRefersToOffer;

import exercise.LeetCode.ListNode;

public class DeleteDuplicateList {

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null)
            return null;
        ListNode p1, p2;
        ListNode head = new ListNode(0);
        p1 = head;
        p1.next = pHead;
        p2 = pHead.next;
        while (p1.next != null && p2 != null) {
            if (p1.next.val == p2.val) {
                int duplicate = p2.val;
                while (p2.next != null && p2.next.val == duplicate) {
                    p2 = p2.next;
                }
                p2 = p2.next;
                p1.next = p2;
                if (p2 != null)
                    p2 = p2.next;
                continue;
            }
            p1 = p1.next;
            p2 = p2.next;

        }
        return head.next;
    }


    public ListNode deleteDuplication2(ListNode pHead) {
        if (pHead==null||pHead.next==null)
            return pHead;
        ListNode head=new ListNode(0);
        head.next=pHead;
        ListNode pre,last;
        pre=head;
        last=pre.next;
        while (last!=null){
            if (last.next!=null&&last.val!=last.next.val){
                pre=pre.next;
                last=last.next;
            }
            else {
                while (last.next != null && last.val == last.next.val) {
                    last = last.next;
                }
                pre.next = last.next;
                last = last.next;
            }


        }
        return head.next;
    }
}
