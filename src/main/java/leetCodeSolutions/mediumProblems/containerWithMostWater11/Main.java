package leetCodeSolutions.mediumProblems.containerWithMostWater11;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        int result = solution.maxArea(height);
        System.out.println(result);
    }
}
