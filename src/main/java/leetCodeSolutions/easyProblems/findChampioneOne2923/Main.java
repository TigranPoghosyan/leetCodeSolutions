package leetCodeSolutions.easyProblems.findChampioneOne2923;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {{0,0,1},{1,0,1},{0,0,0}};
        int champion = solution.findChampion(grid);
        System.out.println(champion);
    }
}
