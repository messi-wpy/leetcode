package exercise.SwordRefersToOffer;


/**
 * 《剑指offer 》
 *  20题
 *  调整数组奇数在前偶数在后
 *   其实是一类问题的解法 如归并
 */
public class ReOrderArray {

    public void reOrderArray(int [] array) {
        if (array==null||array.length==0)
            return;

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==1){
                int j=i-1;
                int temp=array[i];
                while (j>=0&&array[j]%2==0){
                    array[j+1]=array[j];
                    j--;
                }
                array[j+1]=temp;
            }
        }

    }


        public void reOrderArray2(int [] array) {
        if (array==null||array.length==0)
            return;
        int start=0;
        int end=array.length-1;
        while (start<end){
            while (start<end&&func(array[start])){
                start++;
            }

            while (start<end&&!func(array[end])){
                end--;
            }

            if (start<end){
                int temp=array[start];
                array[start]=array[end];
                array[end]=temp;
            }

        }
    }


    public boolean func(int num){
        return (num&1)==1;
    }

}
