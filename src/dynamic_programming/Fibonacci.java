package dynamic_programming;

import java.util.Scanner;

//TODO: UPDATE FIBONACCI FUNCTION
public class Fibonacci {

    static int fibMemoization(int n){
        int [] cache = new int[n +1];
        cache[0] = 0;
        cache[1] = 1;
        for (int i = 2; i <= n; i++){
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[n];
    }
    static int findFib(int n){

        if (n ==0 || n == 1){
            return 1;
        }
        int a = 0;
        int b = 1;
        int sum = a + b;
        while (n > 1){
            sum = a + b;
            a = b;
            b = sum;
            n--;
        }
        return sum;
    }

    static int fibRecur(int n){
        if (n <= 1)
            return n;
        return fibRecur(n-1) + fibRecur(n -2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the nth fibonacci");
        int fib = input.nextInt();
        System.out.println("Fibonacci value is: " + findFib(fib));
        System.out.println("Memoized: " + fibMemoization(fib));
        System.out.println("Recursion: " + fibRecur(fib));
    }
}
