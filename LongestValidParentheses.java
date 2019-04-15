package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class LongestValidParentheses {

    public static void main(String[] args) {
        System.out.println(dpLongestVS("(()"));
    }
    public static int longestValidParentheses(String s) {
        if (s==null||s.length()==0)return 0;
        Deque<Integer> stack=new LinkedList<>();
        int start=-1;
        int res=0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='('){
                stack.push(i);
            }else {
                if (stack.isEmpty()){
                    start=i;
                    continue;
                }else {

                    stack.pop();
                    if (stack.isEmpty()){
                        res=Math.max(res,i-start);
                    }else
                        res=Math.max(res,i-stack.peek());

                }


            }
        }
        return res;

    }

    /**
     * dp动态规划解法:
     * ()        ---->s[i]=s[i-2]+2
     *
     *
     * ...(..))     ---->s[i]=s[i-1]+2+s[i-s[i-1]-2]
     *
     */

    public static  int dpLongestVS(String s){
        int dp[]=new int[s.length()];
        int max=0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i)==')'){
                if (s.charAt(i-1)=='(')
                    dp[i]=(i>=2?dp[i-2]:0)+2;
                else if (i-dp[i-1]>0&&s.charAt(i-dp[i-1]-1) =='('){
                    dp[i]=dp[i-1]+2+((i-dp[i-1])>=2?dp[i-dp[i-1]-2]:0);

                }
                max=Math.max(max,dp[i]);
            }
        }
        return max;


    }
}
