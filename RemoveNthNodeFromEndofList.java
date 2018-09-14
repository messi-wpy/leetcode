public class RemoveNthNodeFromEndofList {
    public static void main(String[]args){
        ListNode head=new ListNode(0);
        ListNode p;
        p=head;
        for (int i=1;i<=2;i++){
            ListNode temp=new ListNode(i);
            p.next=temp;
            p=temp;
        }
        removeNthFromEnd(head,2);


    }
    public  static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next==null)return null;
        ListNode h=new ListNode(0);
        h.next=head;
        ListNode first=h;
        ListNode second =h;
        for (int i=0;i<n+1;i++){
            first=first.next;
        }
        while (first!=null){
            second=second.next;
            first=first.next;
        }
        second.next=second.next.next;
        return h.next;
    }


}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }