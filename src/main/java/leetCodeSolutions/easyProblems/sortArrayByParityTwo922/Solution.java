package leetCodeSolutions.easyProblems.sortArrayByParityTwo922;

public class Solution {
    public int[] sortArrayByParityTwo(int[] nums){
        int odd = 0;
        int even = 1;

        while(odd < nums.length && even < nums.length){
            while (odd < nums.length && nums[odd] % 2 == 0){
                odd +=2;
            }
            while (even < nums.length && nums[even] % 2 == 1){
                even += 2;
            }
            if (even < nums.length && odd < nums.length){
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
            }
        }
        return nums;
    }
}
