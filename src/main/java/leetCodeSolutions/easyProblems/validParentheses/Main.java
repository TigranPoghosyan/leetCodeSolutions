package leetCodeSolutions.easyProblems.validParentheses;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean valid = solution.isValid("()[]{}");
        boolean valid1 = solution.isValid("()[{}");
        System.out.println(valid);
        System.out.println(valid1);
    }
}
