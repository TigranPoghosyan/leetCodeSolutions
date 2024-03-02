package leetCodeSolutions.easyProblems.repeatedSubstringPattern459;

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
       int index = (s+s).indexOf(s,1);
       return index < s.length();
    }
}
