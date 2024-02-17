package leetCodeSolutions.easyProblems.longestCommonPrefix14;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = new String[]{"flower","flow","flight"};
        String[] strs1 = new String[]{"bflower","yflow","flight"};
        String result = solution.longestCommonPrefix(strs);
        String result1 = solution.longestCommonPrefix(strs1);
        System.out.println(result);
        System.out.println(result1);

    }
}
