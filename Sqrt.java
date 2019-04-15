package leetcode;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
    public static int mySqrt(int x) {
        if (x==0)return 0;
        int left=0;
        int right=Integer.MAX_VALUE;

        while (left<=right){
            int mid=(right-left)/2+left;
            if (mid==x/mid) return mid;
            if (mid>x/mid){
                right=mid-1;

            }else {
                if (mid+1>x/(mid+1))return mid;
                left=mid+1;

            }


        }
        return -1;

    }
}
