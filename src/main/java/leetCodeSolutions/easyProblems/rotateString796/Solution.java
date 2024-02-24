package leetCodeSolutions.easyProblems.rotateString796;

public class Solution {
    public boolean rotateString(String s,String goal){
        return (s.length() == goal.length() && (s+s).contains(goal));
    }
}
