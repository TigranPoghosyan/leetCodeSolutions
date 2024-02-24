package leetCodeSolutions.easyProblems.rotateString796;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String a = new String("abcde");
        String goal = new String("cdeab");
        boolean result = solution.rotateString(a,goal);
        System.out.println(result);
    }
}
