import java.sql.*;

public class JDBCConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/demo";
        String username = "root";
        String password = "";
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database successfully!");
            Statement st = conn.createStatement();
            String query = "SELECT * FROM students";
            ResultSet rs = st.executeQuery(query);
            System.out.println("\nStudent Records:");
            System.out.println("ID\tName\tMarks");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");
                System.out.println(id + "\t" + name + "\t" + marks);
            }
            rs.close();
            st.close();
            conn.close();
            System.out.println("\nConnection Closed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}