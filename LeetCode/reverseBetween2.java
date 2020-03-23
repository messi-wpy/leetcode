package exercise.LeetCode;

public class reverseBetween2 {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next=new ListNode(4);
        head.next.next.next=new ListNode(5);
        reverseBetween(head,2,4);
        System.out.println("aaa");
    }
    public  static ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null)return head;

        ListNode myhead=new ListNode(0);
        myhead.next=head;
        ListNode start=myhead.next;;
        ListNode pre=myhead;
        n=n-m;
        while(m>1){
            pre=pre.next;
            start=start.next;
            m--;
        }
        while(n>0){
            n--;
            ListNode remove=start.next;
            start.next=start.next.next;
            remove.next=pre.next;
            pre.next=remove;


        }
        return myhead.next;
    }
}
