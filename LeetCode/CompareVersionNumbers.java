package exercise.LeetCode;

public class CompareVersionNumbers {
    public static void main(String[] args) {
        System.out.println(compareVersion("7.5.2.4","7.5.3"));
    }
    public static int compareVersion(String version1, String version2) {
        if (version1==null||version2==null)
            return 0;
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");
        int i=0;
        while (i<v1.length||i<v2.length){
            int a,b;
            a=i<v1.length?Integer.parseInt(v1[i]):0;
            b=i<v2.length?Integer.parseInt(v2[i]):0;
            if (a>b)
                return 1;
            else if (a<b)
                return -1;
            i++;
        }
        return 0;
    }


}
