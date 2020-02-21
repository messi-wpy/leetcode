package exercise.SwordRefersToOffer;

public class MoreThanHalfNum {
    public static void main(String[] args) {
        MoreThanHalfNum m=new MoreThanHalfNum();
        int []arr={2,2,2,2,2,1,3,4,5};
        System.out.println(m.MoreThanHalfNum_Solution(arr));
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
}
