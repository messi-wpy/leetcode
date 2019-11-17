package exercise.SwordRefersToOffer;

/**
 * 剑指offer
 * 数组类2
 */
public class DuplicationNum {

    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null || numbers.length == 0) return false;
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

    public boolean duplicate2(int numbers[], int length, int[] duplication) {
        if (numbers==null||numbers.length==0)return false;
        for (int i = 0; i <numbers.length ; i++) {
            while (numbers[i]!=i){
                if (numbers[i]==numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                }

                int temp=numbers[i];
                numbers[i]=numbers[temp];
                numbers[temp]=temp;
            }
        }
        return  false;
    }

    public int getDuplication(int []numbers,int length){
        if (numbers==null||numbers.length==0)
            return -1;

        int start=1;
        int end=numbers.length-1;
        while (start<=end){
            int mid=(end-start)/2+start;
            int count=countRange(numbers,start,mid);
            if (end==start){
                if (count>1)
                    return start;
                else
                    break;
            }
            if (count>(mid-start+1)){
                end=mid;
            }else
                start=mid+1;


        }


        return -1;
    }

    private int countRange(int[]numbers,int start,int end){
        int count=0;
        for (int i = start; i <=end ; i++) {
            if (numbers[i]>=start&&numbers[i]>=end){
                count++;
            }
        }
        return count;


    }
}