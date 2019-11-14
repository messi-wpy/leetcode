package exercise.LeetCode;

public class PalindromeNumber {
    public static void main(String[]args){
        System.out.print(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        if (x<0)return false;
        int a=x;
        int copy=0;
        while (x!=0){
            copy=copy*10+x%10;
            x/=10;
        }
        return copy==a;
    }
}
