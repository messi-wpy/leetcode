package exercise.work;

import java.util.Scanner;

public class TesingN {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String a=sc.next();
            String b=sc.next();
            int i=0;
            for (int j=0; i < a.length()&&j<b.length(); j++) {
                if (a.charAt(i)==b.charAt(j)){
                    i++;
                    continue;
                }

            }
            System.out.println(i==a.length()?"Yes":"No");

        }
    }
}
