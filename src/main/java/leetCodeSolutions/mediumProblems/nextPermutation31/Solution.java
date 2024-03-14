package leetCodeSolutions.mediumProblems.nextPermutation31;

public class Solution {
//    public void nextPermutation(int[] nums) {
//        if (nums == null || nums.length <= 1) {
//            return;
//        }
//        int len = nums.length;
//        int left = len - 2;
//
//        while (left >= 0 && nums[left] >= nums[left + 1]) {
//            left--;
//        }
//        if (left >= 0) {
//            int right = nums.length - 1;
//            while (right >= 0 && nums[left] >= nums[right]) {
//                right--;
//            }
//            swap(nums, left, right);
//        }
//        reverse(nums, left + 1);
//    }
//
//    public static void swap(int[] nums, int left, int right) {
//        int temp = nums[left];
//        nums[left] = nums[right];
//        nums[right] = temp;
//    }
//
//    public static void reverse(int[] nums, int val) {
//        int left = val;
//        int right = nums.length - 1;
//        while (left < right) {
//            int temp = nums[left];
//            nums[left] = nums[right];
//            nums[right] = temp;
//            left++;
//            right--;
//        }
//    }
}
