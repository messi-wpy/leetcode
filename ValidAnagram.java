package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())return false;
        int[]alphabet=new int[255];
        for (int i = 0; i <t.length() ; i++) {
            alphabet[t.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i)]--;
            if (alphabet[s.charAt(i)]<0){
                return false;
            }
        }
        return true;
    }
}
