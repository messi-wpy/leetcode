import java.util.Arrays;

public class FirstUniqueCharacterInAString {


    public static void main(String[] args) {
        System.out.print(firstUniqChar("leetcode"));

    }

    public static int firstUniqChar(String s) {
        if (s==null||s.length()==0)return -1;
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;

        }
        int  index=0;
        while (index<s.length()&&alphabet[s.charAt(index)-'a']!=1)
            index++;

        return index==s.length()?-1:index;


    }
}

