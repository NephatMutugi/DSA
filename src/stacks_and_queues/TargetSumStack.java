package stacks_and_queues;

import java.util.Arrays;

public class TargetSumStack {
    //TODO: Find the number of ways to assign the +/- symbols to achieve the target
    // Givens: nums[1,1,1,1,1], target = 3, output is 5

    static int total;

    public static void main(String[] args) {
        int [] arr = {1,1,1,1,1};
        int result = findTargetSumWays(arr, 3);
        System.out.println("RESULT: " + result);
    }

    public static int findTargetSumWays(int[] nums, int S) {
        total = Arrays.stream(nums).sum();

        int[][] memo = new int[nums.length][2 * total + 1];
        for (int[] row : memo) {
            Arrays.fill(row, Integer.MIN_VALUE);
        }
        return calculate(nums, 0, 0, S, memo);
    }

    public static int calculate(int[] nums, int i, int sum, int S, int[][] memo) {
        if (i == nums.length) {
            if (sum == S) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (memo[i][sum + total] != Integer.MIN_VALUE) {
                return memo[i][sum + total];
            }
            int add = calculate(nums, i + 1, sum + nums[i], S, memo);
            int subtract = calculate(nums, i + 1, sum - nums[i], S, memo);
            memo[i][sum + total] = add + subtract;
            return memo[i][sum + total];
        }
    }
}

