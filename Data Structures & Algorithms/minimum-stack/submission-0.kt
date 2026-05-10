class MinStack() {
    val stack = ArrayDeque<Pair<Int,Int>>()
    fun push(`val`: Int) {
        if (stack.isEmpty())
        {
            stack.add(Pair(`val`, `val`))
        }
        else
        {
            var curMin = stack.last().second
            var newMin = min(`val`, curMin)
            stack.add(Pair(`val`, newMin))
        }
    }

    fun pop() {
        stack.removeLast()
    }

    fun top(): Int {
        return stack.last().first
    }

    fun getMin(): Int {
        return stack.last().second
    }
}
