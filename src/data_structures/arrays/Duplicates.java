package data_structures.arrays;

public class Duplicates {
    public static void findDuplicates(int [] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 1, 5, 6, 3, 0, 4, 2,3};
        findDuplicates(arr);
    }
}
