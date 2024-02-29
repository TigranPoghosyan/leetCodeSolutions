package leetCodeSolutions.mediumProblems.minimumTimeDifference539;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> timePoints = new ArrayList<>();
        timePoints.add("23:59");
        timePoints.add("00:00");
        int minDifference = solution.findMinDifference(timePoints);
        System.out.println(minDifference);
    }
}
