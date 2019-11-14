package exercise.LeetCode

fun main(){

}

fun sortedArrayToBST(nums: IntArray): TreeNode? {
    if (nums.isEmpty())
        return null
    fun createBFS(start:Int,end:Int): TreeNode?{
        if (start>end)
            return null
        val mid=(end-start)/2+start
        val root= TreeNode(nums[mid])
        root.left=createBFS(start,mid-1)
        root.right=createBFS(mid+1,end)
        return root
    }

    return createBFS(0,nums.size-1)

}