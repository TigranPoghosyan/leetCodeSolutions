package leetCodeSolutions.easyProblems.assignCookies455;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] g = {1,2,3};
        int[] s = {1,1};
        int contentChildren = solution.findContentChildren(g,s);
        System.out.println(contentChildren);
    }
}
