
import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(101);
        int numberOfTries = 0;
        
        boolean win = false;

        while (win == false) {
            Scanner input = new Scanner(System.in);
             int guess;
            System.out.println("Guess a number between 1 and 100:");
            guess = input.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high");
            }

            if (numberOfTries == 10) {
                System.out.println("You didn't guess the number in 10 attempts. You lose!");
                break;
            }
        }

        if (win == true) {
            System.out.println("You win!");
            System.out.println("The number was " + numberToGuess);
            System.out.println("It took you " + numberOfTries + " tries");
        }
    }
}