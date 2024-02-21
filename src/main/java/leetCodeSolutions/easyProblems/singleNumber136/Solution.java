package leetCodeSolutions.easyProblems.singleNumber136;

public class Solution {
    public int singleNumber(int[] nums){
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
