package exercise.SwordRefersToOffer;

public class InversePairs {

    public static void main(String[] args) {
        InversePairs i=new InversePairs();
        int []test={1,2,3,4,5,6,7,0};
        System.out.println(i.InversePairs(test));
    }
    public int InversePairs(int [] array) {
        if (array==null||array.length==0){
            return 0;
        }
        int []aux=new int[array.length];

        return inversePairsHelp(array,aux,0,array.length-1)%1000000007;
    }

    public int inversePairsHelp(int []array,int[]aux,int start,int end){
        if (start>=end){
            return 0;
        }
        int mid=(start+end)>>1;
        int left=inversePairsHelp(array,aux,start,mid)%1000000007;
        int right=inversePairsHelp(array,aux,mid+1,end)%1000000007;

        int num=0;
        int a=mid;
        int b=end;

        for (int i = start; i <=end ; i++) {
            aux[i]=array[i];
        }
        int index=end;
        while (b>mid&&a>=start){
            if (aux[a]>aux[b]){
                num+=b-mid;

                if(num>=1000000007)//数值过大求余
                {
                    num%=1000000007;
                }

                array[index--]=aux[a--];
            }else {
                array[index--]=aux[b--];
            }

        }
        while (b>mid){
            array[index--]=aux[b--];
        }
        while (a>=start){
            array[index--]=aux[a--];
        }


        return num+left+right;



    }
}
