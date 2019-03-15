

public class RotatList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String [] args){
        ListNode head ;
        ListNode h=new ListNode(0);
        head=h;
        for (int i=1;i<=2;i++){
            ListNode p=new ListNode(i);
            h.next=p;
            h=h.next;
        }
        h.next=null;
        head=rotateRight(head,4);
        for (int i=0;i<3;i++) {
            System.out.println(head.val);
            head=head.next;
        }
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if (head==null||head.next==null)return head;
        ListNode tail=head;
        int length=1;
        while (tail.next!=null){
            tail=tail.next;
            length++;
        }
        tail.next=head;
        k=k%length;
        int i=length-k-1;
        for (int j=0;j<i;j++)
            head=head.next;
        tail=head;
        head=head.next;
        tail.next=null;
        return head;

    }
}
