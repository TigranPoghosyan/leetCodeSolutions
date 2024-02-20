package leetCodeSolutions.easyProblems.backspaceStringCompare844;

import java.util.Stack;

public class Solution {
    //Here we have two great solutions first with Stack and second with StringBuilder

// 1) Stack Solution
    public boolean backspaceCompare(String s, String t) {
        return stackSolution(s).equals(stackSolution(t));
    }

    private String stackSolution(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        return stack.toString();
    }
}

// 2) StringBuilder solution
//public boolean backspaceCompare(String s,String t){
//    return checkBackspace(s).equals(checkBackspace(t));
//}
//
//private String checkBackspace(String str) {
//    StringBuilder result = new StringBuilder();
//
//    for(char c : str.toCharArray()){
//        if(c != '#'){
//            result.append(c);
//        } else if (result.length() != 0) {
//            result.deleteCharAt(result.length() - 1);
//        }
//    }
//
//    return result.toString();
//}
