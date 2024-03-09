package leetCodeSolutions.easyProblems.maximumAverageSubarrayOne643;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,12,-5,-6,50,3};
        double maxAverage = solution.findMaxAverage(nums,4);
        System.out.println(maxAverage);
    }
}
