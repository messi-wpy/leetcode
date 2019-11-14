package exercise.LeetCode;

public class KMP {
    public static void main(String[] args) {
        System.out.print(kmp("abadabababaaabcadab","ab"));

    }


    public static int kmp(String str,String parttar){
        int next[]=new int[parttar.length()];
        int time=0;
        makeNext(next,parttar);
        for (int i=0,j=0;i<str.length();i++,j++){
            while (str.charAt(i)!=parttar.charAt(j)){
                if (next[j]<0){
                    i++;
                    j++;
                    continue;
                }
                j=next[j];

            }
            if (j==parttar.length()-1) {
                j = 0;
                time++;
            }

        }
        return time;

    }
    public static void makeNext(int []next,String parttar){
        int j,k;
        k=next[0]=-1;
        j=1;
        while (j<parttar.length()){
            if (k<0||parttar.charAt(k)==parttar.charAt(j)){
                k++;
                next[j++]=k;

            }
            else {
                k=next[k];

            }

        }

    }
}
