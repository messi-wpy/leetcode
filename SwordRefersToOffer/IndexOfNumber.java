package exercise.SwordRefersToOffer;

public class IndexOfNumber {
    public static void main(String[] args) {
        System.out.println(11/10);
        System.out.println(getIndexOfNumber(1001));
    }
    public  static int  getIndexOfNumber(int index){

        int n=1;
        while (true){
            int amount=getAmount(n);
            if (index>=amount){
                index-=amount;
                n++;
                continue;
            }
            else {
                int digit=getDigit(n,index);
                return digit;
            }
        }



    }


    public static int getDigit(int n,int position){
        int a=position/n+begin(n);
        int b=n-position%n;
        for (int i = 1; i <b ; i++) {
            a/=10;
        }
        return a%10;
    }
    public static int getAmount(int n){
        if (n==1){
            return 10;
        }

        return (int)( n*Math.pow(10,n-1)*9);

    }
    public static int begin(int n){
        if (n==1){
            return 0;
        }
        return (int)(Math.pow(10,n-1));
    }

}
