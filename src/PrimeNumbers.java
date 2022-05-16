import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    private static void findPrimeNumbers(){
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= 100; i++){

            if (i == 2 || i == 3 || i == 5 || i ==7) {
                primeNumbers.add(i);
            } else if ((i % 2) == 0 || (i % 3) == 0 || (i % 5) == 0 || (i % 7) == 0 ){
                System.out.print("*");
            } else {
                primeNumbers.add(i);
            }
        }
        System.out.println();
        System.out.print(primeNumbers + " ");
    }

    public static void main(String[] args) {
        findPrimeNumbers();
    }
}
