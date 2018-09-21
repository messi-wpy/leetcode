import java.util.Stack;

public class ValidParentheses {
    public static void main(String []args){
        ValidParentheses v=new ValidParentheses();
        System.out.println(v.isValid("["));
    }
   //利用stack的先进先出
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        if (s.length()==1)return false;
        for (char c:s.toCharArray()
             ) {
            if (c=='(')
                stack.push(')');
            else if(c=='{')
                stack.push('}');
            else if(c=='[')
                stack.push(']');
            else  {
                if (stack.empty()||c!=stack.pop())
                    return false;

            }
        }
        if (stack.empty())
            return true;
        else
            return false;
    }



}
