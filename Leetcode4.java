public class Leetcode4 {
    ////beats 73%
    public static void main(String[]orgs){
        Leetcode4 leetcode4=new Leetcode4();
        int[]a={2,2,2};
        int[]b={2,2,2,2};
        System.out.print(leetcode4.findMedianSortedArrays(a,b));
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum = nums1.length + nums2.length;
        int index = 0;
        int m, n;
        int []num=new int[sum];
        m = n = 0;
        double result;
        if (nums1.length==0){
            if (nums2.length%2!=0)
                return (double) nums2[(nums2.length-1)/2];
            else
                return ((double)(nums2[nums2.length/2-1]+nums2[nums2.length/2]))/2;
        }
        if (nums2.length==0){
            if (nums1.length%2!=0)
                return (double) nums1[(nums1.length-1)/2];
            else
                return ((double)(nums1[nums1.length/2-1]+nums1[nums1.length/2]))/2;
        }
        if (sum % 2 != 0) {
            index = (sum - 1) / 2;
            for (int i = 0; i <= index ; i++) {
                if (nums1[m] > nums2[n]){
                    num[i]=nums2[n];
                    n++;
                }
                else{
                    num[i]=nums1[m];
                    m++;
                }
            }
            result = num[index];
            return result;
        } else {
            index = sum / 2 - 1;
            for (int i = 0; i <= (index+1) ; i++) {
                if (m==nums1.length){
                    num[i]=nums2[n];
                    n++;
                    continue;
                }
                if (n==nums2.length){
                    num[i]=nums1[m];
                    m++;
                    continue;
                }
                if (nums1[m] > nums2[n]){
                    num[i]=nums2[n];
                    n++;
                }
                else{
                    num[i]=nums1[m];
                    m++;
                }
            }
            result=(double)(num[index]+num[index+1])/2;
            return result;
        }
    }
}
