package exercise.SwordRefersToOffer;

import java.util.ArrayDeque;
import java.util.Deque;

public class TwoStackQueue {

    Deque<Integer> stack1 = new ArrayDeque<Integer>();
    Deque<Integer> stack2 = new ArrayDeque<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (!stack2.isEmpty()){
            return stack2.pop();
        }
        if (stack1.isEmpty())
            throw new RuntimeException("stack is empty");
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
