package leetcode;

public class reverseWords {

    public static void main(String[] args) {

    }
    public String reverseWords(String s) {
        String [] list=s.trim().split("\\s+");
        if (list.length==0)return list[0];
        StringBuilder sb=new StringBuilder();
        for (int i = list.length-1; i >=0 ; i--) {
            sb.append(list[i]).append(" ");
        }
        return sb.substring(0,sb.length()-1);
    }
}
