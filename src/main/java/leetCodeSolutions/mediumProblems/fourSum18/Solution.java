package leetCodeSolutions.mediumProblems.fourSum18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0;i<nums.length - 3;i++){
            if(i != 0 && nums[i] == nums[i-1]) continue;

            for(int j = i+1;j < nums.length - 2;j++){
                if(j != i+1 && nums[j] == nums[j-1]) continue;

                int k = j+1,m = nums.length - 1;


                while(k < m){
                    if(k != j+1 && nums[k] == nums[k-1]){
                        k++;
                        continue;
                    }
                    int sum = nums[i] + nums[j] + nums[k] + nums[m];

                    if(sum == target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[k++],nums[m]));
                    }else if(sum < target){
                        k++;
                    }else{
                        m--;
                    }
                }
            }
        }
        return result;
    }
}
