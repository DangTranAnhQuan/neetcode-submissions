class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for (i in nums)
            map[i] = map.getOrDefault(i, 0) + 1

        val sortedList = map.toList().sortedByDescending {it.second}
        val list = IntArray(k)
        for (i in 0 until k)
        {
            list[i] = sortedList[i].first
        }
        return list
    }
}
