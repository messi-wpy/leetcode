package leetcode;

import java.util.LinkedList;
import java.util.Stack;

public class MinStack {
    private Stack<Integer>stack=new Stack<>();
    private Stack<Integer>minStack=new Stack<>();

    public MinStack() {

    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty()||minStack.peek()>=x)
            minStack.push(x);
    }

    public void pop() {
        int a=stack.pop();
        if (a==minStack.peek())
            minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
