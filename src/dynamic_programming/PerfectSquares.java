package dynamic_programming;

import java.util.Arrays;
import java.util.Scanner;

public class PerfectSquares {
    public static int numberOfSquares(int num){
        int max = (int) Math.sqrt(num);
        int [] storeCount = new int[num+1];
        Arrays.fill(storeCount, Integer.MAX_VALUE);
        for (int i = 1; i <= num; i++){
            for (int j=1; j<=max; j++){
                if (i == j * j){
                    storeCount[i] = 1;
                } else if (i > j*j) {
                    storeCount[i] = Math.min(storeCount[i], storeCount[i - j * j] +1);
                }
            }
        }

        return storeCount[num];
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to find perfect squares: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Number of perfect Squares is: " + numberOfSquares(num));

    }
}

