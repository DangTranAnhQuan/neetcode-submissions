class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val a = mutableMapOf<Char, Int>()
        
        for (i in s)
            a[i] = a.getOrDefault(i, 0) + 1
        
        for (i in t)
        {
            val cnt = a.getOrDefault(i,0)
            if (cnt == 0)
                return false
            a[i] = cnt - 1
        }
        return true
    }
}
