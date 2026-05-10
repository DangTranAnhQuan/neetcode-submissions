class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        var n = s.length / 2
        
        if (s.length % 2 != 0)
            return false

        for (i in 0 until s.length)
        {
            if (s[i] == '(' || s[i] == '[' || s[i] == '{')
                stack.add(s[i])
            else if (stack.isEmpty() || (s[i] == ')' && stack.last() != '(') || (s[i] == ']' && stack.last() != '[') 
            || (s[i] == '}' && stack.last() != '{'))
                return false
            else stack.removeLast()  
        }
        return stack.isEmpty()
    }
}
