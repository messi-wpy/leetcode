package exercise.SwordRefersToOffer;

public class ReplaceSpace {

    /**
     * 剑指offer 第五题
     *
     *  请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，
     * 当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     * @param str
     * @return
     */

    public static String replaceSpace(StringBuffer str){
        if (str==null||str.length()==0)return null;
        int newLength=0;
        int oldLength=str.length();
        int blank=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' ')
                blank++;

        }
        newLength=str.length()+2*blank;
        str.setLength(newLength);

        int p1=oldLength-1;
        int p2=newLength-1;
        while (p1!=p2){
            if (str.charAt(p1)==' '){
                str.setCharAt(p2--,'0');
                str.setCharAt(p2--,'2');
                str.setCharAt(p2--,'%');
                p1--;
            }else {
                str.setCharAt(p2--,str.charAt(p1));
                p1--;
            }
        }
        return str.toString();
    }

    //o(n^2)
    public static String replaceSpace2(StringBuffer str) {
        int length=str.length();
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==' '){
                str.replace(i,i+1,"%20");
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        StringBuffer s=new StringBuffer();
        s.append("WeAreHappy");
        System.out.println(replaceSpace(s));
    }



}
