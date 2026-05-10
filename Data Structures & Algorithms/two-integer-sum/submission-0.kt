class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var step:Int = 1
        var j:Int = 0
        for (i in nums.indices)
        {
            for (j in i + 1 until nums.size)
            {
                if (nums[j] + nums[i] == target)
                    return intArrayOf(i,j)
            }
        }

        return intArrayOf()
    }
}
