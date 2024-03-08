package leetCodeSolutions.easyProblems.validBoomerang1037;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] points = {{1, 1}, {2, 3}, {3, 2}};
        boolean boomerang = solution.isBoomerang(points);
        System.out.println(boomerang);
    }
}
