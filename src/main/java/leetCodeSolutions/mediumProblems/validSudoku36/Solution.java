package leetCodeSolutions.mediumProblems.validSudoku36;

import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentVal = board[i][j];
                if (currentVal != '.') {
                    // Construct unique identifiers for each cell value in row, column, and sub-box
                    String rowIdentifier = currentVal + " found in row " + i;
                    String columnIdentifier = currentVal + " found in column " + j;
                    String subBoxIdentifier = currentVal + " found in sub box " + i / 3 + "-" + j / 3;

                    // Check if the identifiers already exist in the HashSet
                    if (!seen.add(rowIdentifier) || !seen.add(columnIdentifier) || !seen.add(subBoxIdentifier)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
