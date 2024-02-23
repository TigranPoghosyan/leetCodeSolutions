package leetCodeSolutions.easyProblems.removeAllAdjacentDuplicatesInString1047;

public class Solution {
    public String removeDuplicates(String s) {
        char[] result = new char[s.length()];
        int i = 0;

        for(int j = 0;j<s.length();j++){
            char currentChar = s.charAt(j);

            if(i > 0 && result[i-1] == currentChar){
                i--;
            }else{
                result[i] = currentChar;
                i+=1;
            }
        }
        return new String(result,0,i);
    }
}
