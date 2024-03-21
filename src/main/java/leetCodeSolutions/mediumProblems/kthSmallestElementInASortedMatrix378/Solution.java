package leetCodeSolutions.mediumProblems.kthSmallestElementInASortedMatrix378;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int low = matrix[0][0];
        int high = matrix[rows-1][columns-1];

        while(low < high){
            int mid = low + (high - low) / 2;
            int count = 0;
            int j = columns-1;

            for (int[] numbers : matrix) {
                while (j >= 0 && numbers[j] > mid) {
                    j--;
                }
                count += j + 1;
            }
            if(count < k){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return low;
    }
}
