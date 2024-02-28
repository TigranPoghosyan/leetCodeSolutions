package leetCodeSolutions.mediumProblems.searchInRotatedSortedArray33;

public class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[left] <= nums[mid]) { //checking if first half array is sorted if so
                if (nums[left] <= target && target < nums[mid]) { //check if target lies in the range if so
                    right = mid - 1;                              // search in first half only
                } else                                         //else search in second half
                    left = mid + 1;
            } else {  //if first half isn't sorted go and check for second
                if (nums[mid] < target && target <= nums[right]) { //check if target lies in second half
                    left = mid + 1;                             //if so search in second half
                } else {
                    right = mid - 1;
                }
            }
        }
        return nums[left] == target ? left : -1;
    }
}
