package exercise.SwordRefersToOffer;

public class MinNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        if (array==null||array.length==0)
            return 0;
        int first=0;
        int last=array.length-1;
        int mid=first;
        while (array[first]>=array[last]){
            if (last-first==1){
                mid=last;
                break;
            }
            mid=(last-first)/2+first;
            if (array[first]==array[mid]&&array[last]==array[mid]){
                mid=inorderFind(array);
                break;
            }

            if (array[first]<=array[mid]){
                first=mid;
                continue;
            }
            if (array[mid]<=array[last]){
                last=mid;
                continue;
            }

        }
        return array[mid];
    }

    public int inorderFind(int[]array){
        int res=0;
        for (int i = 1; i <array.length ; i++) {
            if (array[res]<array[i])
                res=i;
        }
        return res;

    }
}
