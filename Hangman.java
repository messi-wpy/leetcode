import java.util.*;

public class Hangman {

    public String guessWord(String feedback, String[] words) {
        int i = 0;
        int result = 0;
        Map<Character, Boolean> map = new HashMap<>();
        for (int j = 0; j < feedback.length(); j++) {
            if (feedback.charAt(j) != '-')
                map.putIfAbsent(feedback.charAt(j), true);
        }
        for (int index = 0; index < words.length; index++) {
            String w = words[index];
            if (w.length() != feedback.length()) continue;
            int j = 0;
            for (; j < feedback.length(); j++) {
                if (feedback.charAt(j) == '-') {
                    if (map.get(w.charAt(j)) != null)
                        break;
                    else
                        continue;

                } else {
                    if (feedback.charAt(j) != w.charAt(j))
                        break;

                }
            }
            if (j == feedback.length())
                if (i != 0) return "";
                else {
                    result = index;
                    i++;
                }
        }
        return i == 0 ? "" : words[result];


    }


}

