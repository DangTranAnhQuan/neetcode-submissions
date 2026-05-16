class Solution {

    fun encode(strs: List<String>): String {
        var result = StringBuilder()
        for (str in strs)
        {
            result.append(str.length).append('#').append(str)
        }

        return result.toString()
    }

    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()
        var i = 0
        while (i < str.length)
        {
            var j = i
            while (str[j] != '#')
                j++
            val dodai = str.substring(i, j).toInt()
            val chuoi = str.substring(j + 1, j + 1 + dodai)
            result.add(chuoi) 
            i = j + 1 + dodai
        }
        return result
    }
}
