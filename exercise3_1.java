package leetcode;

public class exercise3_1 {

    public static void main(String[] args) {
        int nums[] = {23, 4, 1, 3, 54, 32, 3, 3, 4};
        System.out.println(findMax(nums, 0, nums.length - 1));
    }

    /**
     *
     *
     * @param array
     * @param lo 数组的起始
     * @param hi 数组的结尾
     * @return 返回最大值所在的index
     *
     *
     *
     *
     *
     *
     */
    public static int findMax(int[] array, int lo, int hi) {

        if (lo == hi) return lo;

        int mid = (hi - lo) / 2 + lo;
        int left = findMax(array, lo, mid);
        int right = findMax(array, mid + 1, hi);

        return array[left] >= array[right] ? left : right;


    }
}
