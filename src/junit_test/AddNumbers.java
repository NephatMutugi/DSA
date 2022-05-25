package junit_test;

public class AddNumbers {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        int sum = 0;

        for (int a : nums)
            sum += a;
        System.out.println("SUM -> " + sum);
    }
}
