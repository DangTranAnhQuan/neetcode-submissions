class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val result = mutableListOf<List<Int>>()
        for (i in 0 until nums.size - 2)
        {
            var tmp = nums[i]
            if (nums[i] > 0)
                break
            if (i > 0 && nums[i] == nums[i-1])
                continue
            var left = i + 1
            var right = nums.size - 1

            while (left < right)
            {
                var sum = tmp + nums[left] + nums[right]
                if (sum == 0)
                {
                    result.add(listOf(tmp, nums[left], nums[right]))
                    left++
                    right--
                    while(left < right && nums[left] == nums[left - 1])
                        left++
                    while(left < right && nums[right] == nums[right + 1])
                        right--
                }
                else if (sum < 0)
                    left++
                else
                    right--
            }

        }
        return result
    }
}
