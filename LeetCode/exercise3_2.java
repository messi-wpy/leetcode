package exercise.LeetCode;

public class exercise3_2 {

    public static void main(String[] args) {
        int nums[]={5,3,1,9,8,2,4,7};
        exercise3_2 e=new exercise3_2();
        e.quickSort(nums,0,nums.length-1,1);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public void quickSort(int []array,int lo,int hi,int n){
        if (lo<hi){
            int k=partition(array,lo,hi);
            System.out.println(String.format("第 %d 次划分 key=%d :%d-----%d,%d-----%d",n,k,lo,k-1,k+1,hi));
            for (int i = lo; i <k ; i++) {
                System.out.print(array[i]+" ");
            }
            System.out.print("  ");
            System.out.print(array[k]+"   ");
            for (int i = k+1; i <=hi ; i++) {
                System.out.print(array[i]+" ");
            }
            System.out.println();
            quickSort(array,lo,k-1,n+1);
            quickSort(array,k+1,hi,n+1);

        }


    }

    public int partition(int []array,int lo,int hi){
        int key=array[lo];
        while (lo<hi){
            while (array[hi]>key&&hi>lo)
                hi--;
            array[lo++]=array[hi];
            while (array[lo]<key&&hi>lo)
                lo++;
            array[hi--]=array[lo];
        }
        array[lo]=key;
        return lo;

    }

}
