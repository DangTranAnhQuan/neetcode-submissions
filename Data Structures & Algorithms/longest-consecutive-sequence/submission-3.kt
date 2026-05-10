class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val set = nums.toHashSet()
        var longest = 0

        for(num in set)
        {
            if (!set.contains(num - 1))
            {
                var cur = num
                var dodai = 1

                while (set.contains(cur + 1))
                {
                    cur = cur + 1
                    dodai += 1
                }

                if (dodai > longest)
                {
                    longest = dodai
                }
            }
        }
        return longest
    }
}
