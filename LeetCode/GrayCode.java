package exercise.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {

    public static void main(String[] args) {
        System.out.println(grayCode(2));
    }
    public static List<Integer> grayCode(int n) {
        List<Integer>list=new ArrayList<>();
        list.add(0);

        for (int i = 0; i <n ; i++) {
            int size=list.size();
            for (int j = size-1; j >=0 ; j--) {
                list.add(list.get(j)|(1<<i));
            }
        }

    return list;
    }
}


