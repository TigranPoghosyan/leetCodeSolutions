package leetCodeSolutions.mediumProblems.search2DMatrix74;

public class Solution {
    public boolean searchMatrix(int[][] matrix,int target){
        if (matrix.length == 0){
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;

        int left = 0;
        int right = rows * columns - 1;

        while (left <= right){
            int midPoint = left + (right - left) / 2;
            int midPointElement = matrix[midPoint/columns][midPoint%rows];
            if (midPointElement == target){
                return true;
            }else if(target < midPointElement){
                right = midPoint - 1;
            } else if (target > midPointElement) {
                left = midPoint + 1;
            }
        }
        return true;
    }
}
