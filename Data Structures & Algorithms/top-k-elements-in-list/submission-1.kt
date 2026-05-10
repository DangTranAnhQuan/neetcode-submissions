class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for (i in nums)
            map[i] = map.getOrDefault(i, 0) + 1

        val pq = PriorityQueue<Map.Entry<Int,Int>> { a,b -> a.value - b.value}
        for (entry in map.entries)
        {
            pq.add(entry)
            if (pq.size > k)
                pq.poll()
        }

        val result = IntArray(k)
        for (i in 0 until k)
            result[i] = pq.poll().key

        return result
    }
}
