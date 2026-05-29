import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int N1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int N2 = sc.nextInt();
        System.out.print("Choose an operation ('+','-','*','/'): ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("Result: " + (N1 + N2));
                break;
            case '-':
                System.out.println("Result: " + (N1 - N2));
                break;
            case '*':
                System.out.println("Result: " + (N1 * N2));
                break;
            case '/':
                System.out.println("Result: " + (N1 / N2));
                break;
            default:
                System.out.println("Invalid Operation!");
        }
    }
}