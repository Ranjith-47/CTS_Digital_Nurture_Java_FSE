import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("Enter ID and Name of the students: ");
            int id = sc.nextInt();
            String name = sc.nextLine();
            map.put(id, name);
        }
        System.out.println("Enter key to search");
        int key = sc.nextInt();
        System.out.println("Name: " + map.get(key));
    }
}