package exercise.LeetCode;

public class LongestCommonPrefix {
    public static void main(String[] orgs){
        LongestCommonPrefix l=new LongestCommonPrefix();
        String []s={"flower","flow","flight"};
        System.out.print(l.longestCommonPrefix(s));
    }
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        try {
            for (int j = 0; true; j++) {
                for (int i = 0; i < strs.length - 1; i++) {
                    if (strs[i].charAt(j) != strs[i + 1].charAt(j))
                        return sb.toString();
                }
                sb.append(strs[0].charAt(j));
            }
        }catch (Exception e){
            return sb.toString();
        }
    }

}
