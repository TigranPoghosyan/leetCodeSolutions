package leetCodeSolutions.easyProblems.countElementsWithMaximumFrequency3005;

public class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] numbers = new int[101];
        int result = 0;

        for (int i : nums) {
            numbers[i]++;
        }

        int max = 0;
        for (int i = 0; i < 101; i++) {
            max = Math.max(max, numbers[i]);
        }

        for (int i = 0; i < 101; i++) {
            if (numbers[i] == max) {
                result += max;
            }
        }
        return result;
    }
}
