package exercise.LeetCode;

import java.util.Deque;
import java.util.LinkedList;

public class SimplifyPath {

    public static void main(String[] args) {
        System.out.println(simplifyPath("/a/../../b/../c//.//"));
    }
    public static String simplifyPath(String path) {
        Deque<String>stack=new LinkedList<>();
        String[] file=path.split("/+");
        for (int i = 0; i <file.length ; i++) {
            switch (file[i]){
                case "":
                    break;
                case "." :
                    break;
                case "":
                    if (!stack.isEmpty()&&!stack.peek().equals("/")){
                        stack.pop();
                    }
                    break;
                default:
                    stack.push(file[i]);
            }
        }
        if (stack.isEmpty())
            return "/";
        StringBuilder sb=new StringBuilder();
        for (int i = stack.size()-1; i>=0; i--) {
                    sb.append("/").append(((LinkedList<String>) stack).get(i));

        }
        return sb.toString();
    }
}
