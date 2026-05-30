import java.sql.*;
import java.util.*;

public class StudentDAO {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String password = "";
        Scanner sc = new Scanner(System.in);
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            PreparedStatement ps1 = conn.prepareStatement(
                    "INSERT INTO students VALUES (?, ?, ?)");
            ps1.setInt(1, id);
            ps1.setString(2, name);
            ps1.setInt(3, marks);
            ps1.executeUpdate();
            System.out.println("Record Inserted");
            System.out.print("Enter New Marks: ");
            int newMarks = sc.nextInt();
            PreparedStatement ps2 = conn.prepareStatement(
                    "UPDATE students SET marks=? WHERE id=?");

            ps2.setInt(1, newMarks);
            ps2.setInt(2, id);
            ps2.executeUpdate();
            System.out.println("Record Updated");
            conn.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}