package exercise.SwordRefersToOffer;

public class Fibonacci {

    public int Fibonacci(int n) {
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        return Fibonacci(n-1)+Fibonacci(n-2);
    }

    public int Fibonacci2(int n){
        int res[]={0,1};
        if (n<2)
            return res[n];

        long fibonacci1=0;
        long fibonacci2=1;

        long result=0;
        for (int i = 2; i <=n ; i++) {
            result=fibonacci1+fibonacci2;
            fibonacci1=fibonacci2;
            fibonacci2=result;

        }

        return (int)result;
    }
}
