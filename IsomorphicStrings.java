public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("ab","aa"));
    }

    public static boolean isIsomorphic(String s, String t) {

        String[]strings=new String[2];
        strings[0]=s;
        strings[1]=t;
        StringBuilder sb[]=new StringBuilder[2];
       for (int i=0;i<2;i++) {
           int[] alphabet=new int[127];
           int flag=1;
           sb[i]=new StringBuilder();
           for (char c : strings[i].toCharArray()
           ) {
               if (alphabet[c] != 0) {
                   sb[i].append(alphabet[c]);
               } else {
                   alphabet[c] = flag;
                   sb[i].append(flag);
                   flag++;
               }
           }
       }
       return sb[0].toString().equals(sb[1].toString());


    }
}
