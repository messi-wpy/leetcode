package exercise.SwordRefersToOffer;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinOfStack {
    public static void main(String[] args) {
        MinOfStack stack=new MinOfStack();
        stack.push(3);
        System.out.println(stack.min());
        stack.push(4);
        System.out.println(stack.min());
    }
    Deque<Integer>stack=new ArrayDeque<>();
    Deque<Integer>help=new ArrayDeque<>();
    public void push(int node) {
        stack.push(node);
        if (help.isEmpty()||help.peek()>node){
            help.push(node);
        }
        else {
            help.push(help.peek());
        }
    }

    public void pop() {
        stack.pop();
        help.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return help.peek();
    }
}
