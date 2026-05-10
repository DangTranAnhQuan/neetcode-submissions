class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val s = HashSet<Int>(nums.size*2)
        for (i in nums)
            if (!s.add(i))
                return true
        return false
    }
}
