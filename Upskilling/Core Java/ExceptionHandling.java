import java.util.Scanner;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    static void check(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Invalid age!");
        } else {
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            check(age);
        } catch (CustomException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}