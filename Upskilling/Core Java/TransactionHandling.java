import java.sql.*;

public class TransactionHandling {
    static final String url = "jdbc:mysql://localhost:3306/demo";
    static final String user = "root";
    static final String password = "";

    public static void transferMoney(int sender, int receiver, double amount) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            conn.setAutoCommit(false);
            String debitQuery = "UPDATE transactions SET Amount = Amount - ? WHERE Id = ?";
            PreparedStatement debitSt = conn.prepareStatement(debitQuery);
            debitSt.setDouble(1, amount);
            debitSt.setInt(2, sender);
            int debitRows = debitSt.executeUpdate();
            String creditQuery = "UPDATE transactions SET Amount = Amount + ? WHERE Id = ?";
            PreparedStatement creditSt = conn.prepareStatement(creditQuery);
            creditSt.setDouble(1, amount);
            creditSt.setInt(2, receiver);
            int creditRows = creditSt.executeUpdate();
            if (debitRows > 0 && creditRows > 0) {
                conn.commit();
                System.out.println("\nTransaction Successful!");
            } else {
                conn.rollback();
                System.out.println("\nTransaction Failed! Rolled Back.");
            }
        } catch (Exception e) {
            try {
                if (conn != null) {
                    conn.rollback();
                    System.out.println("\nError Occurred! Transaction Rolled Back.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void displayAccounts() {
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM transactions");
            System.out.println("\nTransaction Details");
            System.out.println("---------------------------");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("Id") + " | " +
                                rs.getString("Name") + " | " +
                                rs.getDouble("Amount"));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Before Transfer:");
        displayAccounts();
        transferMoney(1, 2, 1500);
        System.out.println("\nAfter Transfer:");
        displayAccounts();
    }
}