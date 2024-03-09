package leetCodeSolutions.easyProblems.minimumIndexOfTwoLists599;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] list1 = {"happy","sad","good"};
        String[] list2 = {"sad","happy","good"};
        String[] result = solution.findRestaurant(list1, list2);
        System.out.println(Arrays.toString(result));
    }
}
