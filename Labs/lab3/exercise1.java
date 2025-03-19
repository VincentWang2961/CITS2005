package Labs.lab3;

import java.util.Scanner;
import java.util.Random;

public class exercise1 {
    public static void main(String[] args) {

        // Pick a random number between 1 and 100
        int secretNumber = new Random().nextInt(100) + 1;

        System.out.println("I am thinking of a number between 1 and 10. Guess what it is.");
        
        Scanner scanner = new Scanner(System.in);
        int guess;
        
        // Guessing loop
        do {
            guess = scanner.nextInt();
            if (guess > secretNumber) {
                System.out.println("Too high, try again.");
            } else if (guess < secretNumber) {
                System.out.println("Too low, try again.");
            }
        } while (guess != secretNumber);
        
        System.out.println("You got it!");
    }
}
