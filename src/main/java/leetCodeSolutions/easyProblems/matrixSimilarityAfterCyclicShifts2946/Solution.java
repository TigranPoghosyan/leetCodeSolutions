package leetCodeSolutions.easyProblems.matrixSimilarityAfterCyclicShifts2946;

class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        for (int[] ints : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                if (ints[j] != ints[(j + k) % mat[0].length]) {
                    return false;
                }
            }
        }
        return true;
    }
}
