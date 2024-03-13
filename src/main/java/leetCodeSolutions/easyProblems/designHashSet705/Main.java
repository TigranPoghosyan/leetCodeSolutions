package leetCodeSolutions.easyProblems.designHashSet705;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.add(1);      // set = [1]
        solution.add(2);      // set = [1, 2]
        solution.contains(1); // return True
        solution.contains(3); // return False, (not found)
        solution.add(2);      // set = [1, 2]
        solution.contains(2); // return True
        solution.remove(2);   // set = [1]
        solution.contains(2); // return False, (already removed)
    }
}
