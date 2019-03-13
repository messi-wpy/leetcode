import java.util.HashMap;
import java.util.Map;

public class RomenToInteger {

    public static void main(String[] args) {
        System.out.print(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        int[] temp=new int[91];
        temp['I'] = 1;
        temp['V'] = 5;
        temp['X'] = 10;
        temp['L'] = 50;
        temp['C'] = 100;
        temp['D'] = 500;
        temp['M'] = 1000;
        int result=0;
        int pre=0;
        for (int i=s.length()-1;i>=0;i--){
            int x=temp[s.charAt(i)];
            if (x<pre)
                result-=x;
            else {
                result += x;
                pre=x;
            }

        }
        return result;
    }

}
