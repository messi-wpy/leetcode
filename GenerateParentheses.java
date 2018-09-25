import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[]args){
        GenerateParentheses g=new GenerateParentheses();
        g.generateParenthesis(3);
    }
    public  List<String> generateParenthesis(int n) {
        List<String>list=new ArrayList<>();
       // compute(n,n,"",list);
        generate(n,n,list,"");
        return list;
    }

    public void generate(int a,int b,List<String>list,String s ) {
        if (a==0&&b==0) {
            list.add(s);
            return;
        }
         if (a>0) {
             generate(a - 1, b, list, s + '(');
         }
        if (b>a) {
            generate(a, b - 1, list, s + ')');
        }
        return ;
    }
}
