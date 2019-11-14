package exercise.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>res=new ArrayList<>();
        if (numRows<1)return res;
        List<Integer>first=new ArrayList<>();
        first.add(1);
        res.add(first);
        for (int i = 1; i <= numRows; i++) {
            List<Integer>temp=new ArrayList<>();
            temp.add(1);
            for (int j = 1; j <=i-1 ; j++) {
                temp.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }
            temp.add(1);
            res.add(temp);
        }
        return res;
    }
}
