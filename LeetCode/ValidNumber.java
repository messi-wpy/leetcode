package exercise.LeetCode;

public class ValidNumber {
    public static void main(String[] args) {
        System.out.println(new ValidNumber().isNumber("-0.2"));
    }

    //也许这道题确实应该用正则表达式。。。
    public boolean isNumber(String s){
        if (s.trim().isEmpty())return false;
        //[-+]?(\\d+\\.?|\\.\\d+)\\d*(e[-+]?\\d+)?
        String regex="[-+]?(\\d+\\.?|\\.\\d+)\\d*(e[-+]?\\d+)?";
        if (s.trim().matches(regex))
            return true;
        else
            return false;

    }
    public static boolean isNumber2(String s) {
        s=s.trim();
        int index=0;
        if (s.length()==0)return false;
        if (s.equals(""))return false;
        if (!Character.isDigit(s.charAt(index))){
            if ((s.charAt(index)=='+'||s.charAt(index)=='-'||s.charAt(index)=='.')&&s.length()>1)
                index++;
            else 
                return false;
        }

        while (index<s.length()){
            if (Character.isDigit(s.charAt(index)))
                index++;
            else
                break;

        }
        if (index==s.length())
            return true;

        if (s.charAt(index)=='e'){
            index++;
            if (index==s.length())
                return false;
            while (index<s.length()){
                if (Character.isDigit(s.charAt(index)))
                    index++;
                else
                    return false;

            }
            return true;
        }

        if (s.charAt(index)=='.'){
            if (index>=1&&s.charAt(index-1)=='.')return false;
            index++;

            if (index==s.length())
                return true;
            while (index<s.length()){
                if (Character.isDigit(s.charAt(index)))
                    index++;
                else
                    break;

            }
            if (index==s.length())
                return true;
            if (s.charAt(index)=='e'){
                index++;
                if (index==s.length())
                    return false;
                while (index<s.length()){
                    if (Character.isDigit(s.charAt(index)))
                        index++;
                    else
                        return false;

                }
                return true;
            }
            return false;
        }
        return false;
    }
}
