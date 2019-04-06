package leetcode;

public class DivideTwoIntegers {

    public static void main(String[] args) {
        System.out.println(divide(-1,1));
    }
    public  static int divide(int dividend, int divisor) {
        int res=0,preRes=0;
        if (dividend==Integer.MIN_VALUE&&divisor==-1)
            return Integer.MAX_VALUE;
        if (dividend==Integer.MIN_VALUE&&divisor==1)
            return Integer.MIN_VALUE;
        int sign=(dividend>0)^(divisor>0)?-1:1;
        long dividend_=Math.abs((long)dividend);
        long divisor_=Math.abs((long)divisor);

        if (divisor_==1)
            return sign>0?(int)dividend_:(int)-dividend_;
        while (dividend_>=divisor_){
            long temp=divisor_;
            long shift=1;
            while (dividend_>temp<<2){
                shift=shift<<2;
                temp=temp<<2;
            }
            dividend_-=temp;
            preRes+=shift;
            if (preRes-shift!=res)
                return Integer.MAX_VALUE;
            res=preRes;

        }
        return sign>0?res:-res;
    }
}
