package leetCodeSolutions.easyProblems.rectangleOverlap836;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] rec1 = {0, 0, 2, 2};
        int[] rec2 = {1, 1, 3, 3};
        boolean rectangleOverlap = solution.isRectangleOverlap(rec1, rec2);
        System.out.println(rectangleOverlap);
    }
}
