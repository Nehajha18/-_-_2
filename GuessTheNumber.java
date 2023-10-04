import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        int maxAttempts = 10; // You can change this to set a limit on the number of attempts
        int attempts = 0;
        
        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I've selected a random number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("Can you guess it within " + maxAttempts + " attempts?");
        
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You've guessed the number (" + numberToGuess + ") in " + attempts + " attempts.");
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Try again. The number is higher.");
            } else {
                System.out.println("Try again. The number is lower.");
            }
            
            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The number was " + numberToGuess + ".");
            }
        }
        
        scanner.close();
    }
}
