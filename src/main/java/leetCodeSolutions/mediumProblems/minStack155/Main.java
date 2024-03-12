package leetCodeSolutions.mediumProblems.minStack155;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.push(10);
        solution.push(5);
        solution.push(7);
        solution.push(2);
        solution.pop();
        int top = solution.top();
        int min = solution.getMin();
        System.out.println("Top Value = " + top + " Min Value = " + min);
    }
}
