package exercise.LeetCode;

public class DecodeWay {

    public int numDecodings(String s) {
        int f[]=new int[s.length()+1];
        f[0]=1;
        for (int i = 1; i <=s.length() ; i++) {
            if (s.charAt(i-1)!='0'){
                f[i]=f[i-1];
            }
            if (i>1&&s.substring(i-2,i).compareTo("10")>=0&&s.substring(i-2,i).compareTo("26")<=0){
                f[i]+=f[i-2];
            }
        }
        return f[s.length()];
    }
}
