package leetCodeSolutions.mediumProblems.searchInRotatedSortedArrayTwo81;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        boolean result = solution.search(nums, 1);
        System.out.println(result);
    }
}
