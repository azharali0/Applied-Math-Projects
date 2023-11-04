// for the induction
import java.util.Scanner;

public class ProofByInduction {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of iterations: ");
        int n = input.nextInt(); // the number of iterations we want to prove

        // initialize the sum to 0
        int sum = 0;

        // Accumulate the sum
        for (int x = 1; x <= n; x++) {
            sum += x;
        }

        // Sum of each value at a given index per iteration
        int expectedTotalSum = (n * (n + 1)) / 2;

        if (sum == expectedTotalSum)
            System.out.println("The formular n * (n + 1) / 2 holds for n = " + n);
        else
            System.out.println("The formular n * (n + 1) / 2 does not hold for n = " + n);
    }
}