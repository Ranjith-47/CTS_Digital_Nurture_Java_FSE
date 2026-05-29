import java.util.*;

public class LambdaExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int N = sc.nextInt();
        List<String> names = new ArrayList<>();
        System.out.println("Enter the names: ");
        for (int i = 0; i <= N; i++) {
            names.add(sc.nextLine());
        }
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println("Sorted list: ");
        for (String X : names) {
            System.out.println(X);
        }
    }
}