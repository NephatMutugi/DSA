package data_structures.stacks;

public class Main {
    public static void main(String[] args) {
        TargetSumRecursion targetSumRecursion = new TargetSumRecursion();
        TargetSumDynamic targetSumDynamicProg = new TargetSumDynamic();

        int [] arr = {1,1,1,1,1};
        int result = targetSumRecursion.findTargetSumWays(arr, 3);
        System.out.println("RECURSION RESULT: " + result);
        System.out.println("#####################");

        int dynamicResult = targetSumDynamicProg.findTargetSum(arr, 3);
        System.out.println("DYNAMIC PROGRAMMING RESULT: " + dynamicResult);

        System.out.println("****************************");
        System.out.println("****************************");
        System.out.println();
        System.out.println();



    }
}
