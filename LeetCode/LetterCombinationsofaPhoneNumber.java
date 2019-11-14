package exercise.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LetterCombinationsofaPhoneNumber {
    public static void main(String[]args){
        LetterCombinationsofaPhoneNumber l=new LetterCombinationsofaPhoneNumber();
        System.out.println(l.letterCombinations("234").toString());
    }
    public List<String> letterCombinations(String digits) {
        List<String> s=new ArrayList<>();
        if (digits.isEmpty())return s;
        String[] coding = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int[] num=new int[8];

        int length=0;
        for (;length<digits.length();length++)
            num[length]= digits.charAt(length)-48;

         combinate(s,new StringBuilder(),num,0,length,coding);
        //s=Bfs(coding,s,num,length);
        return s;
    }


//DFS求法
    public static void  combinate(List<String>list,StringBuilder s,int[]num,int l,int length,String[] strings){
        if (l==length) {
            list.add(s.toString());
            return;
        }
        for (char c:strings[num[l]].toCharArray()
             ) {
            s.append(c);
            combinate(list,s,num,l+1,length,strings);
            s.deleteCharAt(l);

        }

        }

    //BFS求法


    public static List<String> Bfs(String[] code, List<String> list, int []num, int length) {
            Queue<String> queue = new LinkedList<>();
            queue.add("");
            for (int i=0;i<length;i++) {
                int x=queue.size();
                for (int j = 0; j <x ; j++) {
                    String temp = queue.poll();
                    for (char c : code[num[i]].toCharArray()
                    ) {

                        queue.add(temp + c);
                    }
                }
            }
            return (List<String>) queue;
        }
    }



