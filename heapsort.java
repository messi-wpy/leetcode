public class heapsort {

    public static void main(String[]args){
        heapsort h=new heapsort();
        int []array={22,3,123,4,3,213,43,43,5,34};
        h.heapsort(array);
        for (int a:array
             ) {
            System.out.println(a);

        }


    }
    public void heapsort(int []array){
        //从下往上，建堆
        //最后一个非叶子节点，length/2-1
        for (int i=array.length/2-1;i>=0;i--)
            adjustHeap(array,i,array.length);
        for (int j=array.length-1;j>0;j--){
            swap(array,0,j);
            adjustHeap(array,0,j);


        }


    }

    /**调整堆
     *调整堆总是建立在大顶堆或者小顶堆上的
     * 所以建堆时从下往上
     * 建完后在从上往下调整，只要不需要交换，就可以直接break
     */
    public void adjustHeap(int []array,int start,int length){
        int temp=array[start];
        for (int i=start*2+1;i<length;i=i*2+1){
            if (i+1<length&&array[i]<array[i+1])
                i++;
            if (array[i]>temp) {
                swap(array, i, start);
                start=i;
            }else
                break;

        }
    }
    public void swap(int []array,int a,int b){
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;

    }


}
