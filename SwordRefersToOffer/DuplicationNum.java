package exercise.SwordRefersToOffer;

/**
 * 剑指offer
 * 数组类2
 */
public class DuplicationNum {

    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers==null||numbers.length==0)return false;
        int[] hash = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            if (hash[numbers[i]] != 0) {
                duplication[0] = numbers[i];
                return true;
            } else
                hash[numbers[i]]++;
        }
        return false;

    }
}
