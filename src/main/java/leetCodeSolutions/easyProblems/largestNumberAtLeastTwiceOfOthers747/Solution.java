package leetCodeSolutions.easyProblems.largestNumberAtLeastTwiceOfOthers747;

class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int position = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == max){
                position = i;
            }
            int twice = nums[i] * 2;

            if(twice > max && nums[i] != max){
                return -1;
            }
        }
        return position;
    }
}