package leetCodeSolutions.mediumProblems.openTheLock752;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] deadends = {"0201", "0101", "0102", "1212", "2002"};
        int result = solution.openLock(deadends, "0202");
        System.out.println(result);
    }
}
