public class MergeTwoSortedLists {
    public static void main(String []args){
        MergeTwoSortedLists m=new MergeTwoSortedLists();
        ListNode h=new ListNode(-1);
        for (int i=0;i<10;i++){
            ListNode temp=new ListNode(i);
            h.next=temp;
            h=h.next;
        }

    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode h = new ListNode(0);
        ListNode pa = l1;
        ListNode pb = l2;

        while (pa != null && pb != null) {
            if (pa.val<=pb.val){
                h.next=pa;
                h=h.next;
                pa=pa.next;
            }else{
                h.next=pb;
                h=h.next;
                pb=pb.next;
            }
        }
        if (pa==null)
            h.next=pb;
        else h.next=pa;
        return h.next;
    }
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

