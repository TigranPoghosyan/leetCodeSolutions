package leetCodeSolutions.easyProblems.intersectionOfTwoNonSortedArraysWithDuplicates;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = {1, 2, 3, 2, 0};
        int[] arr2 = {5, 1, 2, 7, 3, 2};

        List<Integer> result = solution.findIntersection(arr1, arr2);
        System.out.println(result);
    }
}
