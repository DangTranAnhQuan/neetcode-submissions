class Solution {
    fun maxArea(heights: IntArray): Int {
        var squareMax = 0
       
       for (left in 0..heights.size)
       {
            for (right in left + 1 until heights.size)
            {
                var squareCur = min(heights[left], heights[right]) * (right - left)
                if (squareCur > squareMax)
                    squareMax = squareCur
            }
       }

        return squareMax
    }
}
