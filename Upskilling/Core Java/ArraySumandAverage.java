import java.util.Scanner;

public class ArraySumandAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter the elements: ");
        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum : " + sum);
        double average = (double) sum / N;
        System.out.println("Average : " + average);
    }
}