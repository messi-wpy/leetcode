package exercise.LeetCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class strStr {
    public static void main(String args[]){
        String haystack="hello";
        String needle="lo";
        System.out.println(strStr(haystack,needle));

    }
    public static int strStr(String haystack, String needle) {
        if (haystack==null||needle==null)return 0;
        if (haystack.length()==0 && needle.length()==0)return 0;
        int j=0;
        for (int i=0;i<haystack.length();i++){
            if (needle.charAt(j)==haystack.charAt(i)){
                j++;
                if (j==needle.length())
                    return i-j+1;
                continue;
            }
            i=i-j;
            j=0;

        }
        return -1;


    }


}
