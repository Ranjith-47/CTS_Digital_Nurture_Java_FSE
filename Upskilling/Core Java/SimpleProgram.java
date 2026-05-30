import java.util.Scanner;

public class SimpleProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 0) {
            System.out.println("Zero");
        } else if (N > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}