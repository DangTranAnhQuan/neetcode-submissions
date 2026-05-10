class Solution {
    fun maxArea(heights: IntArray): Int {
        var squareMax = 0
        var left = 0
        var right = heights.size - 1
    //    for (left in 0..heights.size)
    //    {
    //         for (right in left + 1 until heights.size)
    //         {
    //             var squareCur = min(heights[left], heights[right]) * (right - left)
    //             if (squareCur > squareMax)
    //                 squareMax = squareCur
    //         }
    //    }
        while (left < right)
        {
            var squareCur = min(heights[left], heights[right]) * (right - left)
            squareMax = max(squareMax, squareCur)

            if (heights[left] >= heights[right])
                right--
            else left++
        }
        return squareMax
    }
}
