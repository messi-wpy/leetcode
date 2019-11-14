package exercise.SwordRefersToOffer;

import java.util.Stack;

/**
 * 剑指offer
 * 数组类第一题
 *
 */
public class ArrayFind {
    public static void main(String[] args) {
        int [][]array={{1,2,3},{4,5,6},{7,8,9}};
        ArrayFind a=new ArrayFind();
        System.out.println(a.Find(10,array));
    }

    public boolean Find(int target,int [][]array){
        int row=0;
        int column=array[0].length-1;
        while (row<array.length&&column>=0){
            if (target>array[row][column]){
                row++;
            }
            else if (target<array[row][column]){
                column--;
            }
            else
                return true;

        }
        return false;
    }




    public boolean find(int target, int [][] array) {
        if (array==null||array.length==0)return false;
        Stack<Node>stack=new Stack<>();
        stack.push(new Node(0,0));
        while (!stack.isEmpty()){
            Node node=stack.pop();
            if (node.a>=array.length||node.b>=array[0].length)
                continue;
            int num=array[node.a][node.b];
            if (num==target)
                return true;
            if (node.b<array[0].length-1&&num<array[node.a][node.b+1]){
                stack.push(new Node(node.a,node.b+1));
            }

            if (node.a<array.length-1&&num<array[node.a+1][node.b]){
                stack.push(new Node(node.a+1,node.b));
            }
        }
        return false;
    }
    public static class Node{
        int a;
        int b;
        public Node(int a,int b){
            this.a=a;
            this.b=b;
        }
    }

}
