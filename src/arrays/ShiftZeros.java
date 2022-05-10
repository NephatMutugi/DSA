package arrays;


public class ShiftZeros
{
    public static void main (String[] args)
    {
        int [] arr = {10, 20, 0, 7, 0, 8, 30, 0,88, 0, 0, 20, 0};
        shiftToLeft(arr);
        System.out.println("New Array ");
        for (int j : arr) System.out.print(j + " ");
    }


    private static void shiftToLeft(int [] myArr)
    {
        int count = myArr.length - 1;


        for (int i = count; i >= 0; i--) {
            if (myArr[i] != 0) {
                myArr[count] = myArr[i];
                count--;
            }

        }

        while (count >= 0){
            myArr[count] = 0;
            count--;
        }

    }

}