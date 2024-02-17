package leetCodeSolutions.easyProblems.removeDuplicatesFromSortedArray26;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        Solution solution = new Solution();
        int count = solution.removeDuplicates(nums);
        System.out.println(count);
    }
}
