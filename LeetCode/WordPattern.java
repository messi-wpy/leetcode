package exercise.LeetCode;

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        System.out.print(wordPattern("abba","dog dog dog dog"));


    }

    public static boolean wordPattern(String pattern, String str) {
        HashMap<Character,String> map=new HashMap<>();
        String [] words=str.split("\\s+");
        if (pattern.length()!=words.length)
            return false;
        for (int i=0;i<pattern.length();i++){
            if (!map.containsKey(pattern.charAt(i))){
                if (map.containsValue(words[i]))
                    return false;
                map.put(pattern.charAt(i),words[i]);
            }else {

                if (!map.get(pattern.charAt(i)).equals(words[i]))
                    return false;

            }

        }
        return true;




    }
}
