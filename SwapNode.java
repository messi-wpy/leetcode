package leetcode;

public class SwapNode {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode temp=head;
        for (int i = 2; i <6 ; i++) {
            temp.next=new ListNode(i);
            temp= temp.next;
        }


     /*   ListNode first,second;
        ListNode front=new ListNode(0);
        front.next=head;
        first=front;
        second=front.next.next;
        ListNode node1=first.next;
        ListNode node2=second.next;
        ListNode nextNode1=node1.next;
        ListNode nextNode2=node2.next;

        first.next=node2;
        second.next=node1;
        node1.next=nextNode2;

        node2.next=nextNode1;

        head=front.next;*/
     head=   reverseKGroup(head,3);
      while (head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head==null)return null;
        ListNode first,second;
        ListNode front=new ListNode(0);
        front.next=head;
        first=second=front;
        int i=1;
        while (second.next!=null){
            if (i==k){
                i=1;
               ListNode node1=first.next;
               ListNode node2=second.next;
               ListNode nextNode1=node1.next;
               ListNode nextNode2=node2.next;

                first.next=node2;
                second.next=node1;
                node1.next=nextNode2;

                node2.next=nextNode1;

                second=second.next;
                first=second;
            }
            i++;
            second=second.next;


        }
        return front.next;
    }
}
