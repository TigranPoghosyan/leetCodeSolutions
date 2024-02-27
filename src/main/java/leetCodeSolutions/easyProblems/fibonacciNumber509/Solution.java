package leetCodeSolutions.easyProblems.fibonacciNumber509;

public class Solution {
    public int fib(int n) {
        int first = 0;
        int second = 1;
        int sum = first + second;
        while(n > 1){
            sum = first + second;
            first = second;
            second = sum;

            n--;
        }
        return sum;
    }
}
