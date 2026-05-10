class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size - 1

        while (left < right)
        {
            if (left < right && numbers[left] + numbers[right] < target)
                left++
            
            if (right > left && numbers[left] + numbers[right] > target)
                right--
            
            if (numbers[left] + numbers[right] == target)
                return intArrayOf(left + 1, right + 1)
        }
        return intArrayOf()
    }
}
