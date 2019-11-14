package exercise.LeetCode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {


    private int capacity;
    private HashMap<Integer,Integer>cache;
    private Deque<Integer> deque;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        cache=new HashMap<>();
        deque=new LinkedList<>();
    }

    public int get(int key) {
        if (cache.containsKey(key)){
            deque.remove(key);
            deque.addFirst(key);
            return cache.get(key);
        }else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)){
            cache.put(key,value);
            deque.remove(key);
            deque.addFirst(key);
            return;
        }
        if (cache.size()>capacity){
            int target=deque.getLast();
            cache.remove(target);
        }
        cache.put(key,value);
        deque.addFirst(key);


    }


}
