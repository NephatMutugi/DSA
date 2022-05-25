package junit_test;

public class AddNumbers {
   int myCalc(int [] nums){
       int sum = 0;

       for (int a : nums)
           sum += a;
       System.out.println("SUM -> " + sum);
       return sum;
   }
}
