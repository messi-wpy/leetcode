package exercise.LeetCode;

public class Pow {
    public static void main(String[]args){

        System.out.print(myPow(3,5));
    }
    public static double myPow(double x, int nn) {
        long n = Math.abs((long)nn);
        double res = 1;
        while(n >= 1) {
            res *= n % 2 == 0 ? 1 : x;
            x *= x;
            n >>= 1;
        }
        return nn < 0 ? 1 / res : res;
    }
}
