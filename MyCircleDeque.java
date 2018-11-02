public class MyCircleDeque {
    public static void main(String []ars){
        MyCircularDeque deque=new MyCircularDeque(3);

        deque.insertFront(4);
        deque.insertLast(2);
        deque.insertFront(5);
        System.out.println(deque.isFull());

    }
    static class MyCircularDeque {
        int[] a;
        int front, rear;
        int length;
        /** Initialize your data structure here. Set the size of the deque to be k. */
        public MyCircularDeque(int k) {
            length=k+1;
            a=new int[length];
            front=rear=0;
        }

        /** Adds an item at the front of Deque. Return true if the operation is successful. */
        public boolean insertFront(int value) {
            if (isFull())return false;

            front=(front-1+length)%length;
            a[front]=value;
            return true;
        }

        /** Adds an item at the rear of Deque. Return true if the operation is successful. */
        public boolean insertLast(int value) {
            if (isFull())return false;
            a[rear]=value;
            rear=(rear+1)%length;
            return true;
        }

        /** Deletes an item from the front of Deque. Return true if the operation is successful. */
        public boolean deleteFront() {
            if (isEmpty())return false;
            front=(front+1)%length;
            return true ;
        }

        /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
        public boolean deleteLast() {
            if (isEmpty())return  false;
            rear=(rear-1+length)%length;
            return true ;
        }

        /** Get the front item from the deque. */
        public int getFront() {
            if (isEmpty())return -1;
            return a[front];
        }

        /** Get the last item from the deque. */
        public int getRear() {
            if (isEmpty())return  -1;
            int k=(rear-1+length)%length;
             return a[k] ;
        }

        /** Checks whether the circular deque is empty or not. */
        public boolean isEmpty() {
            return rear==front;
        }

        /** Checks whether the circular deque is full or not. */
        public boolean isFull() {
            return ((rear+1)%length)==front;
        }
    }

}
