package leetCodeSolutions.easyProblems.findWordsThatCanBeFormedByCharacters1160;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        int result = solution.countCharacters(words, chars);
        System.out.println(result);
    }
}
