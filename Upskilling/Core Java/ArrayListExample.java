import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int N = sc.nextInt();
        System.out.println("Enter the names of students: ");
        for (int i = 0; i <= N; i++) {
            String name = sc.nextLine();
            list.add(name);
        }
        System.out.println("Names of students :");
        for (String name : list) {
            System.out.println(name);
        }
    }
}