package exercise.work;

import java.util.Scanner;

public class TesingJ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int time=sc.nextInt();
        for (int i = 0; i <time ; i++) {
            int number=sc.nextInt();
            int n=0;
            int num=number;
            while (num>0){
                n++;
                num/=10;
            }
            int x=number-10*n;
            int j=0;
            for ( j = x>0?x:0; j <number ; j++) {
                int result=j;
                int temp=j;
                while (temp!=0){
                    result+=temp%10;
                    temp/=10;

                }
                if (result==number){
                    System.out.println(j);
                    break;
                }

            }
            if (j==number)
            System.out.println(0);
        }
    }
}
