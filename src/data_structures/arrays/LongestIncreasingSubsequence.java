package data_structures.arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int [] testArray = {5, 10, 20, 3, 4, 10, 8, 6, 20};
        System.out.println("Longest Subsequence: " +lengthOfLongestSubsequence(testArray));

    }

    private static int lengthOfLongestSubsequence(int [] arr){
        int arrLen = arr.length;
        int [] countLenOfSubsequence = new int[arrLen];
        countLenOfSubsequence[arrLen - 1] = 1;
        int maxLIS = 1;

        for (int i = arrLen - 2; i >= 0; i--){
            int maxLISForRemainingElements = 0;
            int currentVal = arr[i];
            for (int j = i + 1; j < arrLen; j++){
                if (currentVal <arr[j]){
                    maxLISForRemainingElements =
                            Math.max(maxLISForRemainingElements, countLenOfSubsequence[j]);
                }
            }
            countLenOfSubsequence[i] = maxLISForRemainingElements + 1;
            maxLIS = Math.max(maxLIS, countLenOfSubsequence[i]);
        }

        return maxLIS;
    }
}
