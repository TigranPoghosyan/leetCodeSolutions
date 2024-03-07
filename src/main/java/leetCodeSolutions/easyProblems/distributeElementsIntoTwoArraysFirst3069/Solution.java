package leetCodeSolutions.easyProblems.distributeElementsIntoTwoArraysFirst3069;

public class Solution {
    public int[] resultArray(int[] nums) {
        int first = 0;
        int current = 0;
        int temp = 0;
        int second = 1;

        while (second < nums.length - 1) {
            if (nums[first] > nums[second]) {
                current = second;
                while (first != second) {
                    temp = nums[second];
                    nums[second] = nums[second + 1];
                    nums[second + 1] = temp;
                    second--;
                }
                first++;
                second = current;
            }
            second++;
        }

        return nums;
    }
}
