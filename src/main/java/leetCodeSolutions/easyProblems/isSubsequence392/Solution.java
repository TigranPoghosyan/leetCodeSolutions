package leetCodeSolutions.easyProblems.isSubsequence392;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;
        }
        int sPointer = 0;
        int tPointer = 0;

        for(int i = 0;i<t.length();i++){
            if(t.charAt(tPointer) == s.charAt(sPointer)){
                sPointer++;
                if(sPointer == s.length()){
                    return true;
                }
            }
            tPointer++;
        }
        return false;
    }
}
