package exercise.LeetCode;

public class ReverseString {
    public static void main(String []args){
        char[] chars={'h','e','l','l','o'};
        reverseString(chars);
        System.out.print(chars);

    }

    public static void reverseString(char[] s) {
        for (int i=0,j=s.length-1;i<j;i++,j--){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;

        }
    }
}
