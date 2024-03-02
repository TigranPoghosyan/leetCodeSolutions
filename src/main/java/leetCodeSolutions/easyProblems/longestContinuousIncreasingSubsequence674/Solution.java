package leetCodeSolutions.easyProblems.longestContinuousIncreasingSubsequence674;

public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int result = 0;
        int first = 0;
        int second = 1;
        while(second < nums.length){
            if(nums[first] < nums[second]){
                result = Math.max(result,second-first + 1);
                second++;
            }
            else{
                first++;
                second++;
            }
        }
        return result;
    }
}
