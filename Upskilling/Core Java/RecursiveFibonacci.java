import java.util.*;

public class RecursiveFibonacci {
    public static int fib(int N) {
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        } else {
            return fib(N - 1) + fib(N - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid input: Negative number");
        } else {
            int res = fib(n);
            System.out.println("Fibonacci of " + n + " = " + res);
        }
    }
}