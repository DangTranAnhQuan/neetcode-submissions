class Solution {
    fun trap(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var areaSum = 0
        var leftMax = 0
        var rightMax = 0
        if (height.isEmpty())
            return 0
        while (left < right)
        {
            leftMax = max(leftMax, height[left])
            rightMax = max(rightMax, height[right])

            if (leftMax < rightMax)
            {
                areaSum += leftMax - height[left]
                left++
            }
            else
            {
                areaSum += rightMax - height[right]
                right--
            }
            
        }
        return areaSum
    }
}
