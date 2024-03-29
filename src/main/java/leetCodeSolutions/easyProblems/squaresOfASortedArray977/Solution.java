package leetCodeSolutions.easyProblems.squaresOfASortedArray977;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int N = nums.length;
        int positivePointer = 0;

        while (positivePointer < N && nums[positivePointer] < 0) {
            positivePointer += 1;
        }
        int negativePointer = positivePointer - 1;

        int[] sorted = new int[N];
        int counter = 0;

        while (negativePointer >= 0 && positivePointer < N) {
            if (nums[negativePointer] * nums[negativePointer] < nums[positivePointer] * nums[positivePointer]) {
                sorted[counter] = nums[negativePointer] * nums[negativePointer];
                negativePointer -= 1;
            } else {
                sorted[counter] = nums[positivePointer] * nums[positivePointer];
                positivePointer += 1;
            }
            counter++;
        }
        while (negativePointer >= 0) {
            sorted[counter] = nums[negativePointer] * nums[negativePointer];
            negativePointer -= 1;
            counter += 1;
        }
        while (positivePointer < N) {
            sorted[counter] = nums[positivePointer] * nums[positivePointer];
            positivePointer++;
            counter += 1;
        }
        return sorted;
    }
}