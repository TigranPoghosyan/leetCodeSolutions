package leetCodeSolutions.easyProblems.findAllNumbersDisappearedInAnArray448;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> disappearedNumbers = solution.findDisappearedNumbers(nums);
        System.out.println(disappearedNumbers);
    }
}
