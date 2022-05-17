package data_structures.arrays;

import static dynamic_programming.LIS.longestLIS;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int [] testArray = {5, 10, 20, 3, 4, 10, 8, 6, 20};
        System.out.println("Longest Subsequence: " +lengthOfLongestSubsequence(testArray));

    }

    private static int lengthOfLongestSubsequence(int [] arr){
        int arrLen = arr.length;
        int [] countLenOfSubsequence = new int[arrLen];
        return longestLIS(arr, arrLen, countLenOfSubsequence);
    }
}
