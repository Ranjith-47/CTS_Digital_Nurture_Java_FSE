import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("ENter the first number: ");
            int N1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int N2 = sc.nextInt();
            int result = N1 / N2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
    }
}