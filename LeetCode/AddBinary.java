package exercise.LeetCode;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));
    }

    public static String addBinary(String a, String b) {
        int length=a.length()>=b.length()?a.length():b.length();
        char[] chars=new char[length+1];
        int  carry=0;
        int index=chars.length-1;
        int i,j;
        for ( i = a.length()-1,j=b.length()-1;i>=0&&j>=0 ; i--,j--,index--) {
            int x=a.charAt(i)-'0';
            int y=b.charAt(j)-'0';
            int add=(x+y+carry);
            carry=add/2;
            chars[index]=(char)( add%2+'0');


        }
        if (i==j){
            if (carry!=0)
                chars[index--]=(char) (carry+'0');
            return new String(chars,index+1,chars.length-index-1);
        }
        String s;
        int l;
        if (i>j) {
            s = a;
            l=i;
        }
        else {
            s = b;
            l=j;
        }
        while (l>=0) {
            int x = s.charAt(l) - '0';
            int add = x + carry;
            carry = add / 2;
            chars[index] = (char) (add % 2 + '0');
            l--;
            index--;
        }

        if (carry!=0)
            chars[index--]=(char) (carry+'0');
        return new String(chars,index+1,chars.length-index-1);

    }

}
