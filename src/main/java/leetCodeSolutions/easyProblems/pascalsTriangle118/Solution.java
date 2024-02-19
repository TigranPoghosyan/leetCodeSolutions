package leetCodeSolutions.easyProblems.pascalsTriangle118;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rectangle = new ArrayList<>();
        if (numRows <= 0){
            return rectangle;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        rectangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> previousRow = rectangle.get(i-1);
            List<Integer> currentRow = new ArrayList<>();

            currentRow.add(1);

            for (int j = 1; j < i; j++) {
                currentRow.add(previousRow.get(j-1)+previousRow.get(j));
            }
            currentRow.add(1);
            rectangle.add(currentRow);
        }
        return rectangle;
    }
}
