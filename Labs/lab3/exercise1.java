package Labs.lab3;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        int secretNumber = 9;
        System.out.println("I am thinking of a number between 1 and 10. Guess what it is.");
        
        Scanner scanner = new Scanner(System.in);
        int guess;
        
        do {
            guess = scanner.nextInt();
            if (guess != secretNumber) {
                System.out.println("Nope, try again.");
            }
        } while (guess != secretNumber);
        
        System.out.println("You got it!");
    }
}
