package leetCodeSolutions.mediumProblems.keysAndRooms841;

import java.util.List;
import java.util.Stack;

public class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms){
        boolean[] seen = new boolean[rooms.size()];
        seen[0] = true;

        Stack<Integer> keys = new Stack<>();
        keys.add(0);

        while(!keys.isEmpty()){
            int currentKey = keys.pop();
            for(int newKey : rooms.get(currentKey)){
                if(!seen[newKey]){
                    seen[newKey] = true;
                    keys.add(newKey);
                }
            }
        }
        for(boolean visited: seen){
            if (!visited){
                return false;
            }
        }
        return true;
    }
}
