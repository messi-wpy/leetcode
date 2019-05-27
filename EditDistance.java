package leetcode;

public class EditDistance {
    public static void main(String[] args) {
        System.out.println(minDistance("horse","ros"));
    }
    public static int minDistance(String word1, String word2) {
        int l1=word2.length()+1;
        int l2=word1.length()+1;
        int [][]dp=new int[l1][l2];

        for (int i = 0; i < l1; i++) {
            dp[i][0]=i;
        }
        for (int i = 0; i < l2; i++) {
            dp[0][i]=i;
        }

        for (int i = 1; i <l1 ; i++) {
            for (int j = 1; j <l2 ; j++) {
                if (word1.charAt(j-1)==word2.charAt(i-1))
                    dp[i][j]=dp[i-1][j-1];
                else {
                    int min=dp[i-1][j];
                    min=Math.min(min,dp[i-1][j-1]);
                    min=Math.min(min,dp[i][j-1]);
                    dp[i][j]=min+1;

                }
            }
        }

        return dp[l1-1][l2-1];

    }
}
