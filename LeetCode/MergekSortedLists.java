package exercise.LeetCode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergekSortedLists {

    public static void main(String[] args) {
        MergekSortedLists m=new MergekSortedLists();

    }
    class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

  //分治算法
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null||lists.length==0) {
            return null;
        }

        return sort(lists,0,lists.length-1);
    }

    public ListNode sort(ListNode[]listNodes,int lo,int hi){
        if (lo>=hi)
            return listNodes[lo];

        int mid= (hi-lo)/2+lo;
        ListNode h1=sort(listNodes,lo,mid);
        ListNode h2=sort(listNodes,mid+1,hi);

        return    merge(h1,h2);


    }

    public ListNode merge(ListNode h1,ListNode h2){
        if (h1==null)return h2;
        if (h2==null)return h1;
        if (h1.val<h2.val){
            h1.next=merge(h1.next,h2);
            return h1;

        }else
            h2.next=merge(h1,h2.next);
            return h2;

    }


    //优先队列算法
    public ListNode mergeKLists_2(ListNode[] lists) {
        if (lists == null||lists.length==0) {
            return null;
        }
        PriorityQueue <ListNode>priorityQueue=new PriorityQueue<>(lists.length, Comparator.comparingInt(a -> a.val));
        ListNode head=new ListNode(0);
        //这样写会添加空指针,以后自己也要注意
        //priorityQueue.addAll(Arrays.asList(lists));
        for (ListNode l:lists){
            if (l!=null)
                priorityQueue.add(l);

        }
        ListNode temp;
        temp=head;
        while (priorityQueue.peek()!=null){
            temp.next=priorityQueue.poll();
            temp=temp.next;
            if (temp.next!=null)
                priorityQueue.add(temp.next);

        }

        return head.next;
    }

}
