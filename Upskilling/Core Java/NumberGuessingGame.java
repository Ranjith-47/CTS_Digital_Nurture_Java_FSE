import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int secret = r.nextInt(100) + 1;
        int guess;
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            if (guess > secret) {
                System.out.println("Your guess is too high");
            } else if (guess < secret) {
                System.out.println("Your guess is too low");
            } else {
                System.out.println("You guessed the correct number");
            }
        } while (guess != secret);
    }
}