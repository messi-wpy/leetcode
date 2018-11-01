//
//第一次beats 100% hhh
public class swapNode {
    private static class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static void main(String []args){
        swapNode s=new swapNode();
        ListNode listNode=new ListNode(1);
        ListNode head=listNode;
        for (int i=2;i<=4;i++){

            ListNode l=new ListNode(i);
            listNode.next=l;
            listNode=listNode.next;
        }

        head=s.swapPairs(head);
       for (int i=0;i<4;i++){
           System.out.println(head.val);
           head=head.next;

       }
    }
    public ListNode swap(ListNode a,ListNode b){
        a.next=b.next;
        b.next=a;
        return b;
    }
    public ListNode swapPairs(ListNode head) {
        if (head==null||head.next==null)return head;
        ListNode h=new ListNode(0);
        ListNode d;
        h.next=head.next;
        d=h;
        while (head.next!=null){
            d.next=swap(head,head.next);
            if (head.next!=null) {
                d = d.next.next;
                head = head.next;
            }else break;
        }
        return h.next;
    }
}
