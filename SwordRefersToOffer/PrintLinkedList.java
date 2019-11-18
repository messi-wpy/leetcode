package exercise.SwordRefersToOffer;

import exercise.LeetCode.ListNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PrintLinkedList {

    /**
     * 剑指offer
     * 面试题6 链表：
     * 从尾到头打印链表
     * @param listNode
     * @return
     */
    //利用栈 “后进先出”特点
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Deque<ListNode> stack = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        ListNode point = listNode;
        while (point != null) {
            stack.push(point);
            point = point.next;
        }
        while (!stack.isEmpty()) {
            list.add(stack.poll().val);
        }
        return list;
    }


    //递归做法---递归本质就是利用函数栈，其实也是栈结构
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> res=new ArrayList<>();
        recursion(listNode,res);
        return res;
    }

    public static void recursion(ListNode listNode, ArrayList<Integer> list) {
        if (listNode == null) {
            return;
        }
        recursion(listNode.next, list);
        list.add(listNode.val);
    }
}
