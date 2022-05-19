package data_structures.arrays;

public class ValidSubsequence {
    public static void main(String[] args) {
        int [] bigArr = {1, 2, 3, 4};
        int [] smallArr = {1, 3, 4};

        System.out.println(isValidSubSequence(bigArr, smallArr));
    }
    public static boolean isValidSubSequence(int [] bigArr, int [] subArr){
        int i = 0, j = 0;
        while (i < bigArr.length && j < subArr.length){
            if (subArr[j] == bigArr[i]){
                j++;
            }
            i++;
        }

        return j == subArr.length;
    }
}
