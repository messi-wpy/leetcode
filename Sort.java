package exercise;

public class Sort {

    public static void main(String[] args) {
        Sort sort=new Sort();
        int []array={8,6,45,4,7,1,45,44,8,31,67,65,33,1243,334,1341,3,13,4,24,2,45346,23,24,2,45,10,18};
        sort.heapSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void bubbleSort(int[]array){
        for (int i = 0; i < array.length; i++) {
            boolean hasSort=true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j]>array[j+1]){
                    exchange(array,j,j+1);
                    hasSort=false;
                }
            }
            if (hasSort)
                break;
        }

    }

    private void selectSort(int[] array){
        for (int i = 0; i <array.length; i++) {
            int k=i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j]<array[k]){
                    k=j;
                }
            }
            exchange(array, i,k);

        }

    }

    public void insertSort(int []array){
        for (int i = 1; i <array.length ; i++) {
            for (int j = i-1; j >=0 ; j--) {
                if (array[i]<array[j]){
                    exchange(array,j,i);
                    i=j;
                }else
                    break;
            }
        }

    }

    public void quickSort(int []array){
        quickSortHelp(array,0,array.length-1);

    }
    private void quickSortHelp(int[]array,int lo,int hi){
        if (lo<hi){
            int p=patition(array,lo,hi);
            quickSortHelp(array,lo,p-1);
            quickSortHelp(array,p+1,hi);

        }

    }


    public int patition(int []array,int lo,int hi){
        int temp=array[lo];
        while (lo<hi){
            while (hi>lo&&array[hi]>=temp){
                hi--;
            }
            if (hi>lo){
                array[lo]=array[hi];
            }
            while (hi>lo&&array[lo]<=temp){
                lo++;
            }
            if (hi>lo){
                array[hi]=array[lo];
            }

        }
        array[lo]=temp;
        return lo;

    }

    public void mergeSort(int[] array){
        mergeSortHelp(array,new int[array.length],0,array.length-1);

    }
    private void mergeSortHelp(int[]a,int[]aux,int lo,int hi){
        if (lo>=hi)return;
        int mid=lo+(hi-lo)/2;
        mergeSortHelp(a,aux,lo,mid);
        mergeSortHelp(a,aux,mid+1,hi);
        merge(a,aux,lo,mid,hi);
    }

    private void merge(int []nums,int[] aux,int lo,int mid,int hi){
        for (int i = lo; i <=hi ; i++) {
            aux[i]=nums[i];
        }
        int a,b;
        a=lo;
        b=mid+1;
        for (int i = lo; i <=hi ; i++) {
            if (a>mid)
                nums[i]=aux[b++];
            else if (b>hi)
                nums[i]=aux[a++];
            else if (aux[a]<aux[b])
                nums[i]=aux[a++];
            else
                nums[i]=aux[b++];
        }

    }

    public void heapSort(int []array){
        for (int i = (array.length-1)/2; i >=0 ; i--) {
            sink(array,i,array.length);
        }

        for (int i = array.length-1; i >0 ; i--) {
            exchange(array,0,i);
            sink(array,0,i-1);

        }


    }

    public void sink(int []array,int start,int n){
        while (start*2+1<n){
            int j=start*2+1;
            if (j+1<n&&array[j]<array[j+1]){
                j=j+1;
            }
            if (array[start]<array[j]){
                exchange(array, start, j);
                start=j;
            }
            else
                break;
        }

    }

    private void print(int[]nums,int lo,int hi){
        for (int i = lo; i < hi; i++) {
            System.out.print(nums[i]+"  ");
        }
    }

    private void exchange(int []array,int a,int b){
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;

    }



}
