import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int N = sc.nextInt();
        int fact = 1;
        if (N < 0) {
            System.out.println("Invalid input: Negative number");
        } else {
            for (int i = 1; i <= N; i++) {
                fact *= i;
            }
        }
        System.out.println("Factorial of " + N + " = " + fact);
    }
}