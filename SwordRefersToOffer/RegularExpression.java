package exercise.SwordRefersToOffer;


/**
 * 《剑指offer》19题
 *  正则表达式匹配
 *  应该用递归来做的
 *
 */
public class RegularExpression {
    public static void main(String[] args) {
        RegularExpression regular=new RegularExpression();
        System.out.println(regular.match("".toCharArray(),".".toCharArray()));
    }

    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null)
            return false;
        return recursion(str,pattern,0,0);
    }

    public boolean recursion(char[]str,char[]pattern,int a,int b){
        if (a==str.length&&b==pattern.length)
            return true;
        if (a!=str.length&&b==pattern.length)
            return false;

        if (b+1<pattern.length&&pattern[b+1]=='*'){
            if (a<str.length&&charMatch(pattern[b],str[a])){
                return recursion(str,pattern,a,b+2)
                        ||recursion(str,pattern,a+1,b)
                        ||recursion(str,pattern,a+1,b+2);
            }
            else
                return recursion(str,pattern,a,b+2);
        }else{
            if (a<str.length&&charMatch(pattern[b],str[a])){
                return recursion(str, pattern, a+1, b+1);
            }else
                return false;

        }

    }

    public boolean charMatch(char pattern, char c){
        if (pattern=='.')
            return true;
        return pattern==c;
    }
}
