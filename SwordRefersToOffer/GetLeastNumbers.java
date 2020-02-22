package exercise.SwordRefersToOffer;

import java.util.ArrayList;

public class GetLeastNumbers {
    public static void main(String[] args) {
        GetLeastNumbers g=new GetLeastNumbers();
        int []input={4,5,1,6,2,7,3,8};
        ArrayList<Integer>res=g.GetLeastNumbers_Solution(input,4);
        res.forEach(System.out::println);
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer>res=new ArrayList<>();
        if(input.length==0||k>input.length)
            return res;
        int start=0;
        int end=input.length-1;
        int index=partition(input,start,end);

        while (index!=k-1){
            if (index<k-1){
                start=index+1;
                index=partition(input,start,end);
            }
            else {
                end=index-1;
                index=partition(input,start,end);
            }

        }
        for (int i = 0; i <= index; i++) {
            res.add(input[i]);
        }
        return res;
    }


    public int partition(int[]input,int lo,int hi){
        int temp=input[lo];
        while (lo<hi){
            while (lo<hi&&input[hi]>temp){
                hi--;
            }
            if (lo<hi){
                input[lo++]=input[hi];
            }

            while (lo<hi&&input[lo]<temp){
                lo++;
            }
            if (lo<hi){
                input[hi--]=input[lo];
            }

        }
        input[lo]=temp;
        return lo;
    }
}
