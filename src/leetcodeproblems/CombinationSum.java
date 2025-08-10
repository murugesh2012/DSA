package leetcodeproblems;
import java.util.*;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, currentCombination, result);
        return result;
    }

    private void backtrack(int[] candidates, int remainingTarget, int startIndex,
                           List<Integer> currentCombination, List<List<Integer>> result) {
        if (remainingTarget == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }
        if (remainingTarget < 0) {
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            if (candidates[i] > remainingTarget) {
                break;
            }
            currentCombination.add(candidates[i]);
            backtrack(candidates, remainingTarget - candidates[i], i, currentCombination, result);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }


    // Test method
    public static void main(String[] args) {
        CombinationSum solution = new CombinationSum();

        // Test case 1
        int[] candidates1 = {2, 3, 6, 7};
        int target1 = 7;
        System.out.println("Input: candidates = " + Arrays.toString(candidates1) + ", target = " + target1);
        System.out.println("Output: " + solution.combinationSum(candidates1, target1));
        System.out.println();

        // Test case 2
        int[] candidates2 = {2, 3, 5};
        int target2 = 8;
        System.out.println("Input: candidates = " + Arrays.toString(candidates2) + ", target = " + target2);
        System.out.println("Output: " + solution.combinationSum(candidates2, target2));
        System.out.println();

        // Test case 3
        int[] candidates3 = {2};
        int target3 = 1;
        System.out.println("Input: candidates = " + Arrays.toString(candidates3) + ", target = " + target3);
        System.out.println("Output: " + solution.combinationSum(candidates3, target3));
        System.out.println();

        // Test case 4 - Edge case with larger numbers
        int[] candidates4 = {1, 2, 3};
        int target4 = 4;
        System.out.println("Input: candidates = " + Arrays.toString(candidates4) + ", target = " + target4);
        System.out.println("Output: " + solution.combinationSum(candidates4, target4));
    }
}