package stacks_and_queues;

public class Main {
    public static void main(String[] args) {
        TargetSumRecursion targetSumRecursion = new TargetSumRecursion();
        TargetSumDynamicProg targetSumDynamicProg = new TargetSumDynamicProg();

        int [] arr = {1,1,1,1,1};
        int result = targetSumRecursion.findTargetSumWays(arr, 3);
        System.out.println("RECURSION RESULT: " + result);
        System.out.println("#####################");

        int dynamicResult = targetSumDynamicProg.findTargetSumWays(arr, 3);
        System.out.println("DYNAMIC PROGRAMMING RESULT: " + dynamicResult);

    }
}
