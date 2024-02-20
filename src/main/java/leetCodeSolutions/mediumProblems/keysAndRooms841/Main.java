package leetCodeSolutions.mediumProblems.keysAndRooms841;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(List.of(1));
        rooms.add(List.of(2));
        rooms.add(List.of(3));
        rooms.add(List.of());
        boolean result = solution.canVisitAllRooms(rooms);
        System.out.println(result);
    }
}
