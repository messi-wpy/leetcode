package leetcode;

public class MajorityElement {
    public static void main(String[] args) {
        int a[]={3,2,3};
        MajorityElement m=new MajorityElement();
        System.out.print(m.majorityElement(a));
    }
    public int majorityElement(int[] nums) {
        return findMajority(nums,0,nums.length-1);
    }

    public int countNum(int []nums,int n,int start,int end){
        int count=0;
        for (int i = start; i <=end ; i++) {
            if (nums[i]==n)
                count++;
        }
        return count;

    }

    public int findMajority(int []nums,int start,int end){
        if (start==end) {
            return nums[start];
        }
        int mid = (end-start)/2 + start;
        int left = findMajority(nums,start,mid);
        int right = findMajority(nums,mid+1,end);

        if (left==right) {
            return left;
        }

        int leftcount=countNum(nums,left,start,end);
        int rightcount=countNum(nums,right,start,end);

        return leftcount>rightcount?left:right;

    }




}
