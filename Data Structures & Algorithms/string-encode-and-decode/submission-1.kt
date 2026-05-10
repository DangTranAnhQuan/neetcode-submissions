class Solution {

    fun encode(strs: List<String>): String {
        val result = StringBuilder()
        for(s in strs)
            result.append(s.length).append('#').append(s)
        return result.toString()
    }

    fun decode(str: String): List<String> {
        val giaima = mutableListOf<String>()
        var i = 0
        while (i < str.length)
        {
            var poskytu = str.indexOf('#', i)
            var dodai = str.substring(i, poskytu).toInt()
            var noidung = str.substring(poskytu + 1, poskytu + dodai + 1)
            giaima.add(noidung)
            i = poskytu + dodai + 1
        }

        return giaima
    }
}
