package leetCodeSolutions.mediumProblems.asteroidCollision735;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] asteroids = {10, 2, -5};
        int[] result = solution.asteroidCollision(asteroids);
        System.out.println(Arrays.toString(result));
    }
}
