import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        List<Integer> result = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Numbers: " + result);
    }
}