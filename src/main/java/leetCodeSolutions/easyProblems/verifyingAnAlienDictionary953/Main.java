package leetCodeSolutions.easyProblems.verifyingAnAlienDictionary953;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"hello", "leetcode"};
        boolean alienSorted = solution.isAlienSorted(words, "hlabcdefgijkmnopqrstuvwxyz");
        System.out.println(alienSorted);
    }
}
