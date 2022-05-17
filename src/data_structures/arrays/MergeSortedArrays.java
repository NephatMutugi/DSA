package data_structures.arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] sortedArr1 = {10, 20, 30, 40, 50, 60};
        int[] sortedArr2 = {5, 15, 25, 30, 35, 45, 50, 55};

        mergeArray(sortedArr1, sortedArr2);
    }

    private static void mergeArray(int [] sortedArr1, int [] sortedArr2){
        int[] mergedArr = new int[sortedArr1.length + sortedArr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < sortedArr1.length && j < sortedArr2.length) {
            if (sortedArr1[i] < sortedArr2[j]) {
                mergedArr[k] = sortedArr1[i];
                i++;
            } else {
                mergedArr[k] = sortedArr2[j];
                j++;
            }
            k++;
        }

        while (i < sortedArr1.length){
            mergedArr[k++] = sortedArr1[i++];
        }

        while (j < sortedArr2.length){
            mergedArr[k++] = sortedArr1[j++];
        }

        System.out.println("COUNTER\tVALUE");
        for (int counter = 0; counter < mergedArr.length; counter++) {
            System.out.println(counter + "\t\t" + mergedArr[counter]);
        }
    }
}
