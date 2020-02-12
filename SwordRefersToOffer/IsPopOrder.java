package exercise.SwordRefersToOffer;

import java.util.ArrayDeque;
import java.util.Deque;

public class IsPopOrder {


    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (popA.length==0||pushA.length==0)
            return false;
        Deque<Integer>stack=new ArrayDeque<>();
        stack.push(pushA[0]);
        int index=1;
        for (int i = 0; i <popA.length ; i++) {
            int popNum=popA[i];
            while (!stack.isEmpty()&&stack.peek()!=popNum&&index<pushA.length){
                stack.push(pushA[index]);
                index++;

            }
            if (stack.isEmpty()||stack.peek()!=popNum){
                return false;
            }
            stack.pop();

        }
        return true;
    }
}
