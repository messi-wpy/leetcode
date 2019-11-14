package exercise.LeetCode;

public class CountAndSay {

    public static void  main(String []args){
        CountAndSay c=new CountAndSay();
        System.out.print(c.countAndSay(5));

    }
    public String countAndSay(int n) {
        StringBuilder s = new StringBuilder();
        s.append('1');
        char a = '1';
        for (int i = 1; i < n; i++) {
            StringBuilder b=new StringBuilder();
            int max=0;
            for (int j = 0; j < s.length(); j++) {
                if (j-1<0||s.charAt(j)==s.charAt(j-1))
                    max++;
                else {
                    b.append(max);
                    b.append(s.charAt(j-1));
                    max=1;

                }

            }
            b.append(max);
            b.append(s.charAt(s.length()-1));
            max=1;
            s=b;

        }
        return s.toString();
    }
}
