package exercise.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubstringWithConcatenationOfAllWords {

    public static void main(String[] args) {
        String[] words={"foo","bar"};
        System.out.println(findSubstring("barfoothefoobarman",words));
    }
    public static List<Integer> findSubstring(String s, String[] words) {
        if (s == null || words == null) return new ArrayList<>();
        int num = words.length;
        int length = words[0].length();
        List<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < num; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }

        for (int i = 0; i <= s.length() - num * length; i++) {
            int j ;
            HashMap<String ,Integer> tempMap=new HashMap<>(map);
            for ( j = i; j < i + num * length; j += length) {
                String temp = s.substring(j, j+length);
                if (tempMap.get(temp) == null) {
                    break;
                } else {
                    if (tempMap.get(temp) <= 0)
                        break;
                    tempMap.put(temp, tempMap.get(temp) - 1);

                }
                if (j == i + (num-1) * length)
                    list.add(i);


            }

        }
        return list;

    }
}
