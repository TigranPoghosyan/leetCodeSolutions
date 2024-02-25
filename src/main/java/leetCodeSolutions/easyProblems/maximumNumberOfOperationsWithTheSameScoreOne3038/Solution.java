package leetCodeSolutions.easyProblems.maximumNumberOfOperationsWithTheSameScoreOne3038;

public class Solution {
    public int maxOperations(int[] nums){
        int result = 1;
        int n = nums.length;
        int score = nums[0] + nums[1];

        for (int i = 2; i < n - 1; i++) {
            if (nums[i] + nums[i+1] == score){
                result +=1;
                i++;
            }
        }
        return result;
    }
}
