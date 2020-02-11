package exercise.SwordRefersToOffer;

import java.util.ArrayDeque;
import java.util.Deque;

public class stacktest {
    public static void main(String[] args) {
        Deque<Integer>stack=new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(23);
        stack.push(456);
        stack.push(17);

        System.out.println(stack.getFirst());
        System.out.println(stack.getLast());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}
