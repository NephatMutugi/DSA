package dynamic_programming;

import java.util.Scanner;

//TODO: UPDATE FIBONACCI FUNCTION
public class Fibonacci {
    static int findFib(int n){
        if (n <= 2)
            return 1;
        return findFib(n-1) + findFib(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the nth fibonacci");
        int fib = input.nextInt();
        System.out.println("Fibonacci value is: " + findFib(fib));
    }
}
