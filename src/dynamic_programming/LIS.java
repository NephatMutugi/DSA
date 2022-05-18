package dynamic_programming;

public class LIS {

    public static void main(String[] args) {
        int [] myArr = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        System.out.println("LIS: " + findLIS(myArr));
    }


    public static int findLIS(int [] myArr){
        int arrayLen = myArr.length;
        int [] countLIS = new int[arrayLen];
        return longestLIS(myArr, arrayLen, countLIS);
    }

    public static int longestLIS(int[] myArr, int arrayLen, int[] countLIS) {
        countLIS[arrayLen - 1] = 1;
        int maxLIS = 1;

        // Sliding Window

        for (int i = arrayLen - 2; i >= 0; i--){
            int maxRemainingLIS = 0;
            int currentVal = myArr[i];
            for (int j = i+1; j < arrayLen; j++){
                if (currentVal < myArr[j]){
                    maxRemainingLIS = Math.max(maxRemainingLIS, countLIS[j]);

                    System.out.println("currentVal----------------------------"+currentVal);
                    System.out.println("j----------------------------"+myArr[j]);
                }
            }
            countLIS[i] = maxRemainingLIS + 1;
            maxLIS = Math.max(maxLIS, countLIS[i]);
        }

        return maxLIS;
    }
}
