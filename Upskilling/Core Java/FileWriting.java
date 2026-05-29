import java.io.*;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter text: ");
            String text = sc.nextLine();
            writer.write(text);
            writer.close();
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.println("Error while writing to file ");
            e.printStackTrace();
        }
    }
}