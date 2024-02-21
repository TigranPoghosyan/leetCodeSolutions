package leetCodeSolutions.easyProblems.reverseOnlyLetters917;

import java.util.Stack;

public class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> letters = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                letters.push(s.charAt(i));
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                result.append(letters.pop());
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}

//Second solution
//  StringBuilder result = new StringBuilder();
//         int j = s.length()-1;

//         for(int i = 0; i<s.length();i++){
//             if(Character.isLetter(s.charAt(i))){
//                 while(!Character.isLetter(s.charAt(j))){
//                     j--;
//                 }
//                 result.append(s.charAt(j));
//                 j--;
//             }else{
//                 result.append(s.charAt(i));
//             }
//         }
//         return result.toString();
