public class StringToInteger {
    public static void main(String[] args) {
        System.out.print(myAtoi("0-1"));
    }

    public static  int myAtoi(String str) {
        if (str==null ||str.length()==0) return 0;
        int i=0;
        boolean isPosition=true;
        int num=0;
        int last=0;
        char [] chars=str.toCharArray();
        while (i<chars.length&&(chars[i]==' '))i++;
        if (i==chars.length)return 0;
        if (!(chars[i]>='0'&&chars[i]<='9')){
            if (chars[i]=='-') {
                isPosition = false;
                i++;
            }
            else  if (chars[i]=='+'){
                i++;
            }
            else
                return 0;
        }

        for (;i<chars.length&&chars[i]>='0'&&chars[i]<='9';i++){
            last=num;
            num=num*10+(chars[i]-'0');
            if( (num/10)!=last)
                return isPosition?Integer.MAX_VALUE:Integer.MIN_VALUE;


        }
        return isPosition?num:-num;



    }
}
