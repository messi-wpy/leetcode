package exercise.LeetCode;

import java.util.Deque;
import java.util.LinkedList;

public class ReverseNodesInKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        Deque<ListNode>stack=new LinkedList<>();
        int i=0;

        ListNode front=new ListNode(0);
        front.next=head;
        ListNode first,second;
        first=second=front;
        while (second.next!=null){
            stack.push(second.next);
            second=second.next;
            i++;
            if (i==k){
                ListNode temp=second.next;
                while (!stack.isEmpty()){
                    first.next=stack.poll();
                    first=first.next;
                }
                first.next=temp;
                second=first;
                i=0;
            }

        }
        return front.next;

    }
}
