class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, MutableList<String>>()
        if (strs.size == 1)
            return listOf(listOf((strs[0])))

        for (s in strs)
        {
            var tmp = s.toCharArray().sorted().joinToString("")
            if (!map.containsKey(tmp))
                map[tmp] = mutableListOf<String> ()
            map[tmp]!!.add(s)
        }
        return map.values.toList()
    }
}
