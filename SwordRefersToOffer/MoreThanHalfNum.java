package exercise.SwordRefersToOffer;

public class MoreThanHalfNum {
    public static void main(String[] args) {
        MoreThanHalfNum m=new MoreThanHalfNum();
        int []arr={2,2,2,2,2,1,3,4,5};
        System.out.println(m.MoreThanHalfNum_Solution2(arr));
    }
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length==0)
            return 0;

        int number,time;
        number=time=0;
        for (int i = 0; i <array.length ; i++) {
            if (time==0){
                number=array[i];
                time++;
            }else {
                if (array[i]!=number) {
                    time--;
                    if (time == 0) {
                        number = array[i];
                        time = 1;
                    }
                }else {
                    time++;
                }
            }
        }
        if (check(array,number))
            return number;
        else
            return 0;
    }
    public boolean check(int []array,int res){
        int time=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==res)
                time++;
        }
        return time>array.length/2;
    }

    public int MoreThanHalfNum_Solution2(int [] array) {
        if(array.length==0)
            return 0;

        int mid =array.length>>1;
        int star=0;
        int end=array.length-1;
        int index=partition(array,star,end);
        while (index!=mid){
            if (index<mid){
                star=index+1;
                index=partition(array,star,end);
            }
            else {
                end=index-1;
                index=partition(array,star,end);
            }
        }
        int res=array[index];
        if (check(array,res)){
            return res;
        }else
            return 0;


    }

    public int partition(int []array,int star,int end){
        int temp=array[star];

        while (star<end){
            while (star<end&&array[end]>=temp){
                end--;
            }
            if (star!=end){
                array[star]=array[end];
            }
            while (star<end&&array[star]<=temp){
                star++;
            }
            if (star!=end){
                array[end]=array[star];
            }
        }
        array[star]=temp;

        return star;
    }


}
