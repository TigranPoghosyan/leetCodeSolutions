package leetCodeSolutions.mediumProblems.taskScheduler621;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int result = solution.leastInterval(tasks, 2);
        System.out.println(result);
    }
}
