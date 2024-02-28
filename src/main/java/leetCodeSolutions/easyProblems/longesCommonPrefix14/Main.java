package leetCodeSolutions.easyProblems.longesCommonPrefix14;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"flower", "flow", "flight"};
        String result = solution.longestCommonPrefix(strs);
        System.out.println(result);
    }
}
