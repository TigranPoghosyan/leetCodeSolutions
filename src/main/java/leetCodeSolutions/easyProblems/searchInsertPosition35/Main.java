package leetCodeSolutions.easyProblems.searchInsertPosition35;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        Solution solution = new Solution();
        int indexOfValue = solution.searchInsert(nums, 5);
        System.out.println(indexOfValue);
    }
}
