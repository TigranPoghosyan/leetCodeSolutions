package leetCodeSolutions.easyProblems.longPressedName925;

public class Solution {
    public boolean isLongPressedName(String name,String typed){
        if (name.length() > typed.length()){
            return false;
        }
        int i = 0;
        int j = 0;

        if(name.charAt(i) != name.charAt(j)){
            return false;
        }

        while (j < typed.length()){
            if(i < name.length() && name.charAt(i) == typed.charAt(j)){
                i++;
            } else if (j == 0 || typed.charAt(j) != typed.charAt(j-1)) {
                return false;
            }
            j++;
        }
        return i == name.length();
    }
}
