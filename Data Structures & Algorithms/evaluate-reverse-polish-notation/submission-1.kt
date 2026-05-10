class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayDeque<Int> ()

        for (token in tokens)
        {
            when (token)
            {
                "+" -> {
                    val b = stack.removeLast()
                    val a = stack.removeLast()
                    stack.add(a+b)
                }
                "-" -> {
                    val b = stack.removeLast()
                    val a = stack.removeLast()
                    stack.add(a-b)
                }
                "*" -> {
                    val b = stack.removeLast()
                    val a = stack.removeLast()
                    stack.add(a*b)
                }
                "/" -> {
                    val b = stack.removeLast()
                    val a = stack.removeLast()
                    stack.add(a/b)
                }
                else -> {
                    stack.add(token.toInt())
                }
            }
        }
        return stack.last()
    }
}
