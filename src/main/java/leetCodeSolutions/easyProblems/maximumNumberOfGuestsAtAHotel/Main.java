package leetCodeSolutions.easyProblems.maximumNumberOfGuestsAtAHotel;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] intervals = {{1, 2}, {1, 3}, {2, 4}, {2, 3}};
        int result = solution.maxGuests(intervals);
        System.out.println(result);
    }
}
