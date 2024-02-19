package leetCodeSolutions.easyProblems.containsDuplicate217;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arrayWithDuplicates = new int[]{1,2,2,3,4};
        int[] arrayWithoutDuplicates = new int[]{1,2,3,4,5};

        boolean firstCheck = solution.containsDuplicate(arrayWithDuplicates);
        System.out.println(firstCheck);

        boolean secondCheck = solution.containsDuplicate(arrayWithoutDuplicates);
        System.out.println(secondCheck);
    }
}
