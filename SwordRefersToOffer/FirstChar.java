package exercise.SwordRefersToOffer;

public class FirstChar {
    public int FirstNotRepeatingChar(String str) {
        int []hash=new int[256];
        int res=-1;
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)]++;
        }
        for (int i = 0; i <str.length(); i++) {
            if (hash[str.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
}
