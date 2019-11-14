package exercise.LeetCode;

import java.util.LinkedList;

public class PermutationSequence {
    public static void main(String[] args) {
        System.out.println(getPermutation(3,3));
    }
    public static String getPermutation(int n, int k) {
        StringBuilder stringBuilder=new StringBuilder();
        int []func=new int[n];
        func[0]=1;

        for (int i = 1; i <n ; i++) {
            func[i]=func[i-1]*i;
        }

        k--;

        LinkedList<Integer>list=new LinkedList<>();
        for (int i = 1; i <=n ; i++) {
            list.add(i);
        }

        for (int i = 0; i < n; i++) {
            int group=func[n-1-i];
            stringBuilder.append(list.get(k/group));
            list.remove(k/group);
            k=k%group;
        }
        return stringBuilder.toString();

    }
}
