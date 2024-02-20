package leetCodeSolutions.easyProblems.validPalindrome125;

public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleanString = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                cleanString.append(c);
            }
        }
        cleanString = new StringBuilder(cleanString.toString().toLowerCase());

        int start = 0;
        int end = cleanString.length() - 1;
        while(start <= end){
            if(cleanString.charAt(start) != cleanString.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
