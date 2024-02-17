package leetCodeSolutions.easyProblems.lengthOfLastWord58;

public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastIndex = s.lastIndexOf(" ")+1;
        return s.length() - lastIndex;
    }
}
//This is another way to solve the problem but in this case Space Complexity is O(n) and Time Complexity is O(n)
//   String[] arr = s.split(" ");
//   return arr[arr.length - 1].length();