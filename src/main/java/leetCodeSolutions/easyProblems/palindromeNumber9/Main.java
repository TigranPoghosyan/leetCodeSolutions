package leetCodeSolutions.easyProblems.palindromeNumber9;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean palindrome = solution.isPalindrome(121);
        boolean anotherTestCase = solution.isPalindrome(122);
        System.out.println(palindrome);
        System.out.println(anotherTestCase);
    }
}
