package leetCodeSolutions.easyProblems.antOntheBoundary3028;

class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count = 0;
        int result = 0;
        for (int num : nums) {
            count += num;
            if (count == 0) {
                result += 1;
            }
        }
        return result;
    }
}
