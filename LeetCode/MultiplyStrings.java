package exercise.LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MultiplyStrings {

    public static void main(String []args){

        System.out.println(multiply("2","3"));


    }


    public static String multiply(String num1, String num2) {
        if (num1.equals("0")||num2.equals("0"))return "0";
        int length1=num1.length();
        int length2=num2.length();
        int [][]results=new int[length2][length1+1];
        int a,b;
        a=b=0;
        for (int i=length2-1;i>=0;i--){
            int carry = 0;
            int y = num2.charAt(i)-'0';
            b=0;
            for (int j = length1-1; j >=0; j--){
                int x=num1.charAt(j)-'0';
                int xy=x*y+carry;
                carry=xy/10;
                results[a][b++]=xy%10;

            }
            results[a++][length1]=carry;
        }


        List<Integer>list=new ArrayList<>();
        int carry=0;
        for (int i=0;i<length2;i++){
            int n=results[i][0];
            int index=1;
            int j=i;
            while (index<=i&&index<(length1+1)){
                n+=results[--j][index++];
            }
            n+=carry;
            list.add(n%10);
            carry=n/10;
        }
        for (int i=1;i<length1+1;i++){
            int l=length2-1;
            int n=results[l][i]+carry;
            int index=i+1;
            while (index<length1+1&&l>0){
                n+=results[--l][index++];

            }

            list.add(n%10);
            carry=n/10;

        }
        if (carry!=0)
            list.add(carry);

        StringBuilder sb=new StringBuilder();
        int i=list.size()-1;
        while (list.get(i)==0)i--;
        for (;i>=0;i--)
            sb.append(list.get(i));
        return sb.toString();
    }

}
