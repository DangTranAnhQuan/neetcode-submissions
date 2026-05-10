class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val s = mutableSetOf<Int>()
        for (i in nums)
            s.add(i)
        
        if (s.size != nums.size)
            return true
        return false
    }
}
