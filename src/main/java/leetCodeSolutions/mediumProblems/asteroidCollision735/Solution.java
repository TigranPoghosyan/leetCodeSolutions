package leetCodeSolutions.mediumProblems.asteroidCollision735;

import java.util.Stack;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            if (stack.isEmpty() || asteroid > 0) {
                stack.push(asteroid);
            } else {
                while (true) {
                    int peek = stack.peek();
                    if (peek < 0) {
                        stack.push(asteroid);
                        break;
                    } else if (peek == -asteroid) {
                        stack.pop();
                        break;
                    } else if (peek > -asteroid) {
                        break;
                    } else {
                        stack.pop();
                        if (stack.isEmpty()) {
                            stack.push(asteroid);
                            break;
                        }
                    }
                }
            }
        }
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}
