import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.CallableStatement;

public class CreateDB {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/sql_file_5";
        String user = "root";
        String password = "THISonal12";

        try {

            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println("Connected to MySQL Database!");

            // Create Statement
            Statement stmt = con.createStatement();

            // Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            // Display Data
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");

                System.out.println(id + " " + name + " " + marks);
            }

            CallableStatement cs = con.prepareCall("{call insertStudent(?,?,?)}");

            cs.setInt(1, 103);
            cs.setString(2, "Rahul");
            cs.setInt(3, 90);

            cs.execute();

            System.out.println("Stored procedure executed successfully");

            // Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}