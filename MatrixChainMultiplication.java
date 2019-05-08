package leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class MatrixChainMultiplication {

    static class Matrix{
        char name;
        int row;
        int colmn;

        public Matrix(char n,int a,int b){
            name=n;
            row=a;
            colmn=b;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Matrix[] matrices=new Matrix[n];
        Deque<Matrix> stack=new LinkedList<>();
        for (int i = 0; i <n ; i++) {
            int b,c;
            char a;
            a=sc.next().charAt(0);
            b=sc.nextInt();
            c=sc.nextInt();
            Matrix matrix=new Matrix((char) a,b,c);
            matrices[matrix.name-'A']=matrix;
        }
        sc.nextLine();
        while (sc.hasNext()){
            int res=0;
            String line=sc.nextLine();

            boolean isRight=true;
            for (int i = 0; i < line.length(); i++) {
                char c=line.charAt(i);
                if (c=='('&&i+1<line.length()){
                    continue;
                }
                if (c==')'){
                    if (stack.size()<2)continue;
                    Matrix b=stack.pop();
                    Matrix a=stack.pop();
                    if (a.colmn!=b.row){
                        isRight=false;
                        break;
                    }
                    res+=a.row*b.colmn*a.colmn;
                    Matrix ab=new Matrix('n',a.row,b.colmn);
                    stack.push(ab);
                    continue;
                }
                stack.push(matrices[line.charAt(i)-'A']);
            }

            System.out.println(isRight?res:"error");



        }


    }
}
