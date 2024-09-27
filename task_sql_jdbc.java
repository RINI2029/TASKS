import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class task_sql_jdbc
{
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/employee_db";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "password";

    public static void main(String[] args)
    {
        insertEmployeeData();
    }

    public static void insertEmployeeData()
    {
        String insertSQL = "INSERT INTO Employee (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL))
        {
            preparedStatement.setInt(1, 101);
            preparedStatement.setString(2, "Jenny");
            preparedStatement.setInt(3, 25);
            preparedStatement.setDouble(4, 10000.00);
            preparedStatement.addBatch();


            preparedStatement.setInt(1, 102);
            preparedStatement.setString(2, "Jacky");
            preparedStatement.setInt(3, 30);
            preparedStatement.setDouble(4, 20000.00);
            preparedStatement.addBatch();


            preparedStatement.setInt(1, 103);
            preparedStatement.setString(2, "Joe");
            preparedStatement.setInt(3, 20);
            preparedStatement.setDouble(4, 40000.00);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 104);
            preparedStatement.setString(2, "John");
            preparedStatement.setInt(3, 40);
            preparedStatement.setDouble(4, 80000.00);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 105);
            preparedStatement.setString(2, "Shameer");
            preparedStatement.setInt(3, 25);
            preparedStatement.setDouble(4, 90000.00);
            preparedStatement.addBatch();

            int[] affectedRows = preparedStatement.executeBatch();

            System.out.println("Inserted " + affectedRows.length + " rows into the Employee table.");

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

