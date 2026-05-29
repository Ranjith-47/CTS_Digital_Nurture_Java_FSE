import java.util.Scanner;

public class EvenorOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        if (N % 2 == 0) {
            System.out.println(N + " is an even number.");
        } else {
            System.out.println(N + " is an odd number.");
        }
    }
}