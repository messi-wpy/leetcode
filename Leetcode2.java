public class Leetcode2 {
    private class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

  public static void main(String []orgs){

  }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int number=create(l1)+create(l2);
        int temp = number%10;
        number/=10;
        ListNode head=new ListNode(temp);
        ListNode l=head;
        while (number!=0){
            temp=number%10;
            number/=10;
            l.next=new ListNode(temp);
            l=l.next;
        }
        return head;
    }

    public int create(ListNode l){
        int num=0;
        int weight=0;
        int [] list=new int[10000];
        while (l.next!=null){
            num=num+(int) (l.val*Math.pow(10.0,weight));
            l=l.next;
            weight++;
        }
        return num;
    }

}
