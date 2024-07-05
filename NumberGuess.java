import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.Scanner;

public class NumberGuess {
    Scanner input = new Scanner(System.in);
    int ranNum = (int) (Math.random() * 100);

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Number Guessing Game:");
        System.out.println();
        System.out.println("Try to guess the number between 1 and 100. You have 10 chances.");

        NumberGuess numberGuess = new NumberGuess();
        numberGuess.guesses();
    }

    public void guesses() {
        /*Scanner input = new Scanner(System.in);*/
        int i; // = guessNumber
        //System.out.println(ranNum); // -- TO CHECK NUMBER
        for (i = 1; i <= 10; i++) {
            System.out.print("Guess " + i + ": ");
            String userInput = input.nextLine();
            int userGuess;
             try {
                userGuess = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 100.");
                i--; // Do not count invalid input as an attempt
                continue;
        }
             int numOfGuesses = i;
            if (userGuess == ranNum) {
                System.out.println();
                System.out.println("Congratulations! You guessed the number in " + i + " guesses!");
                return;
            } else if (userGuess > ranNum) {
                System.out.println("Lower");
            } else if (userGuess < ranNum) {
                System.out.println("Higher");
            }
        }
            if (i > 10) {
                System.out.println();
                System.out.println("Game over. You were unable to guess the number.");
            }
        }
    }
