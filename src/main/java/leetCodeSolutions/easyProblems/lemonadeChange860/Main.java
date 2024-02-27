package leetCodeSolutions.easyProblems.lemonadeChange860;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] bills = {5, 5, 5, 10, 20};
        boolean result = solution.lemonadeChange(bills);
        System.out.println(result);
    }
}
