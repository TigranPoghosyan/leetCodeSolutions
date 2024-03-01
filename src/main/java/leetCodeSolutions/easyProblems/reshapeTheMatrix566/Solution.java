package leetCodeSolutions.easyProblems.reshapeTheMatrix566;

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int columns = mat[0].length;
        if(rows * columns != r * c){
            return mat;
        }
        int[][] result = new int[r][c];
        int rowNum = 0;
        int columnNum = 0;

        for (int[] ints : mat) {
            for (int j = 0; j < columns; j++) {
                result[rowNum][columnNum] = ints[j];
                columnNum++;
                if (columnNum == c) {
                    columnNum = 0;
                    rowNum++;
                }
            }
        }
        return result;
    }
}
