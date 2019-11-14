package exercise.LeetCode;

import java.util.HashMap;

public class Leetcode3 {

    public static void main(String []orgs){
        Leetcode3 l=new Leetcode3();
        System.out.print(l.lengthOfLongestSubstring("abcabcbb"));
    }
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int oldMax=0;
        int newMax=0;
        if (s.length()==1)
            return 1;
        else if (s.length()==0)
            return 0;
        else {
            for (int i=1;i<s.length();i++){
                    if (!map.containsKey(s.charAt(i))) {
                        map.put(s.charAt(i),i);
                        oldMax++;
                        if(i==s.length()-1){
                            if(oldMax>newMax){
                                newMax=oldMax;
                            }
                        }
                    }
                    else {
                        i=map.get(s.charAt(i));
                        map.clear();
                        if (oldMax > newMax) {
                            newMax = oldMax;
                        }
                            oldMax = 0;
                    }
            }
            return newMax;
        }
    }
}
