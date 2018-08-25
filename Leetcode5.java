public class Leetcode5 {
    public static void main(String []orgs){
        Leetcode5 l=new Leetcode5();
        System.out.println(l.longestPalindrome("babad"));
    }
    public String longestPalindrome(String s) {
        int length=s.length();
        int max=0;
        int l=0,r=0;
        boolean [][] dp=new boolean[length][length];
        if (s==null||s.length()==0) return s;

        for (int j=0;j<length;j++){
            for (int i=0;i<=j;i++){
                dp[i][j]=(s.charAt(i)==s.charAt(j))&&(j-i<=2||dp[i+1][j-1]);
                if (dp[i][j]){
                    if (j-i>max){
                        l=i;
                        r=j;
                        max=j-i;
                    }
                }
            }
        }
        return s.substring(l,r+1);
    }
}
