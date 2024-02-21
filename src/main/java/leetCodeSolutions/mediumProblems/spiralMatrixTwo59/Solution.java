package leetCodeSolutions.mediumProblems.spiralMatrixTwo59;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];

        int rowBegin = 0;
        int rowEnd = n - 1;
        int columnBegin = 0;
        int columnEnd = n - 1;

        int count = 1;

        while (rowBegin <= rowEnd && columnBegin <= columnEnd) {

            for (int i = columnBegin; i <= columnEnd; i++) {
                result[rowBegin][i] = count++;
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowEnd; i++) {
                result[i][columnEnd] = count++;
            }
            columnEnd--;

            if (rowBegin <= rowEnd) {
                for (int i = columnEnd; i >= columnBegin; i--) {
                    result[rowEnd][i] = count++;
                }
            }

            rowEnd--;

            if (columnBegin <= columnEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    result[i][columnBegin] = count++;
                }
            }
            columnBegin++;
        }
        return result;
    }
}
