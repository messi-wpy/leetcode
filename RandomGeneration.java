package leetcode;

import java.util.Scanner;

public class RandomGeneration {
    public static void main(String[] args) {
        //m,a,c,X[0],n和g
        long m,a,c,n,g;
        long x;
        Scanner in=new Scanner(System.in);
       m=in.nextLong();
       a=in.nextLong();
       c=in.nextLong();
       x=in.nextLong();
       n=in.nextLong();
       g=in.nextLong();
        long i=0;
        long relust=0;
        while (i<n){
            i++;
            relust=((a*x+c)%m);
            x=relust;
        }

        System.out.println(relust%g);
    }


}
