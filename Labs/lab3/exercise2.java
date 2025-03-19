package Labs.lab3;

import java.util.Scanner;
import java.math.BigInteger;

public class exercise2 {
    public static void main(String[] args) {
        // Get the number from the user
        System.out.println("Enter the number you want to get the factorial of: ");
        Scanner scanner = new java.util.Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        BigInteger F = BigInteger.ONE;

        // Calculate the factorial of the number
        for (int i = 1; i <= N; i++) {
            F = F.multiply(BigInteger.valueOf(i));
        }

        System.out.println(N + "! = " + F);
    }
}