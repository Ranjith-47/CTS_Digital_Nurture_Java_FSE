import java.util.*;

public class Records {
    record Person(String name, int age) {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int N = sc.nextInt();
        sc.nextLine();
        Person[] people = new Person[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter name:");
            String name = sc.nextLine();
            System.out.print("Enter age:");
            int age = sc.nextInt();
            sc.nextLine();
            people[i] = new Person(name, age);
        }
        System.out.println("Person Records:");
        for (Person person : people) {
            System.out.println(person);
        }
        List<Person> peopleList = Arrays.asList(people);
        System.out.println("\nPeople with age > 20:");
        peopleList.stream()
                .filter(person -> person.age() > 20)
                .forEach(System.out::println);
        sc.close();
    }
}