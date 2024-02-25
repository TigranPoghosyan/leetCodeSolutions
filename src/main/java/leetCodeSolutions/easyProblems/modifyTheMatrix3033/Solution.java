package leetCodeSolutions.easyProblems.modifyTheMatrix3033;

class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[][] result = matrix;

        int rows = result.length;
        int columns = result[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (result[i][j] == -1) {
                    int number = convert(result, i, j);
                    result[i][j] = number;
                }
            }
        }
        return result;
    }

    public int convert(int[][] matrix, int row, int column) {
        int result = 0;
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                result = Math.max(result, ints[column]);
            }
        }
        return result;
    }
}
