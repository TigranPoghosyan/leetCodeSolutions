package leetCodeSolutions.mediumProblems.sumOfEvenNumbersAfterQueries985;

class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] outputArray = new int[queries.length];

        int evenSum = 0;

        for (int val : nums) {
            if (val % 2 == 0) {
                evenSum += val;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][1];
            int value = queries[i][0];

            if (nums[index] % 2 == 0) {
                evenSum -= nums[index];
            }
            nums[index] += value;

            if (nums[index] % 2 == 0) {
                evenSum += nums[index];
            }
            outputArray[i] = evenSum;
        }
        return outputArray;
    }
}