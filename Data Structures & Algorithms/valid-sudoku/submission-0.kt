class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val seen = HashSet<String>()
        for (i in board.indices)
        {
            for (j in board.indices)
            {
                var cur = board[i][j]
                
                if (board[i][j] != '.')
                {
                    var boxIndex = (i / 3) * 3 + (j / 3)
                    if((!seen.add("$cur in row $i")) || (!seen.add("$cur in col $j"))
                    || (!seen.add("$cur in box $boxIndex")))
                        return false
                }
            }
        }

        return true
    }
}
