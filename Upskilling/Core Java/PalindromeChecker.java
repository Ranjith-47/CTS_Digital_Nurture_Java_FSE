import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        String check = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                check += ch;
            }
        }
        boolean value = true;
        int i = 0, j = check.length() - 1;
        while (i < j) {
            if (check.charAt(i) != check.charAt(j)) {
                value = false;
                break;
            }
            i++;
            j--;
        }
        if (value) {
            System.out.println("Given string is a palindrome");
        } else {
            System.out.println("Given string is not a palindrome");
        }
    }
}