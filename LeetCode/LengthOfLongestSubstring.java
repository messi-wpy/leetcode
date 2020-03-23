package exercise.LeetCode;

import java.util.HashMap;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0)return 0;
        HashMap<Character,Integer>map=new HashMap<>();
        int start;
        int end;
        start=end=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            end=i;
            if(map.containsKey(s.charAt(i))&&map.get(s.charAt(i))>=start){
                start=map.get(s.charAt(i))+1;
            }
            map.put(s.charAt(i),i);
            res=Math.max(res,end-start+1);


        }
        return Math.max(res,end-start);
    }
}
