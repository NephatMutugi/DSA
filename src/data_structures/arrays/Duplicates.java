package data_structures.arrays;

import java.util.HashSet;

public class Duplicates {


    static HashSet<Integer> duplicates = new HashSet<>();

    //Running time on n^2
    public static void findDuplicates(int [] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }

    //TODO: Reduce running time from n^2
    public static void myDuplicates(int[] array){
        for (int j : array) {
            if (duplicates.contains(j)) {
                System.out.println(j + " has been duplicated");
            } else {
                duplicates.add(j);
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 1, 5, 6, 3, 0, 4, 2,3};
        findDuplicates(arr);
        myDuplicates(arr);
    }
}
