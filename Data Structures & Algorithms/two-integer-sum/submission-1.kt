class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int,Int> ()

        for (i in nums.indices)
        {
            var tmp = target - nums[i]
            if (map.containsKey(tmp))
                return intArrayOf(map[tmp]!!, i)
            map[nums[i]] = i 
        }
        return intArrayOf()
    }
}
