import java.util.*;
import java.util.regex.Pattern;

public class GroupAnagrams {

    public static void main(String[] args) {
        String []strs={"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
    public  static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map= new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[]tempChars=strs[i].toCharArray();
            Arrays.sort(tempChars);
            String tempString=new String(tempChars);
            if (map.containsKey(tempString)){
                map.get(tempString).add(strs[i]);
            }else {
                List<String> list=new ArrayList<>();
                list.add(strs[i]);
                map.put(tempString,list );
            }
        }

        return new ArrayList<>(map.values());
    }
}
