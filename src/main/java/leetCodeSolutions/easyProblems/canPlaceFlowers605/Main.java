package leetCodeSolutions.easyProblems.canPlaceFlowers605;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] flowerBed = {1,0,0,0,1};
        boolean result = solution.canPlaceFlowers(flowerBed,2);
        System.out.println(result);
    }
}
