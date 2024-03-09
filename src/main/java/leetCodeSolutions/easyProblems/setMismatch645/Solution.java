package leetCodeSolutions.easyProblems.setMismatch645;

public class Solution {
    public int[] findErrorNums(int[] nums) {
        int num = 0;
        for(int i = 0;i<nums.length;i++){
            num ^= nums[i];
        }
        for(int i =0;i<nums.length;i++){
            if(nums[i] == num-1){
                return new int[]{num-1,num};
            }else if(nums[i] == num + 1){
                return new int[]{num+1,num};
            }
        }
        return new int[]{};
    }
}
