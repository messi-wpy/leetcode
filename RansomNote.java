public class RansomNote {

    public static void main(String []args){
        System.out.print(canConstruct("aa","aab"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        int []alphabet=new int[26];
        for(int i=0;i<magazine.length();i++){
            alphabet[magazine.charAt(i)-'a']++;
        }
        for (int j=0;j<ransomNote.length();j++){
            alphabet[ransomNote.charAt(j)-'a']--;
            if (alphabet[ransomNote.charAt(j)-'a']<0)
                return false;

        }
        return true;


    }
}
