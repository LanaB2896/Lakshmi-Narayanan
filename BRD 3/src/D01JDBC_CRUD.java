

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class D01JDBC_CRUD {

	public static void main(String[] args) {
			readEmployees();
			//insertEmployee(2, "Shiny");
			//updateEmployee(2, "Ebony");
			deleteEmployee(2);
			readEmployees();
	}
	private static void readEmployees() {
		try {
			// Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Get a connection
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			//Create a statement
			Statement statement = connection.createStatement();
			//Execute a Query
			ResultSet employeeResultSet = statement.executeQuery("SELECT EMPLOYEE_ID, FIRST_NAME FROM emp");
			//Iterate through the result set and display the records.
			System.out.println("Employee Records!");
			while(employeeResultSet.next()) {
				System.out.println(employeeResultSet.getInt(1) + "\t" +employeeResultSet.getString("first_name") );

			}
			
		} catch (ClassNotFoundException exception) {
			System.out.println(exception);
		} catch (SQLException exception) {
			System.out.println(exception);
		}
	}
	private static void insertEmployee(int employeeID, String firstName ) {
		try {
			// Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Get a connection
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			//Create a statement
			Statement statement = connection.createStatement();
			//Execute a Query
			String insertQuery = "insert into emp values(" + employeeID + ",'" + firstName + "')";
			//System.out.println(insertQuery);
			int noOfRowsAffected = statement.executeUpdate(insertQuery);
			//Iterate through the result set and display the records.
			System.out.println(noOfRowsAffected + " row(s) inserted!");
			
		} catch (ClassNotFoundException exception) {
			System.out.println(exception);
		} catch (SQLException exception) {
			System.out.println(exception);
		}
	}
	private static void updateEmployee(int employeeID, String firstName ) {
		try {
			// Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Get a connection
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			//Create a statement
			Statement statement = connection.createStatement();
			//Execute a Query
			String updateQuery = "update emp set first_name = '" + firstName + "' where employee_id =" + employeeID;
			//System.out.println(insertQuery);
			int noOfRowsAffected = statement.executeUpdate(updateQuery);
			//Iterate through the result set and display the records.
			System.out.println(noOfRowsAffected + " row(s) updated!");
			
		} catch (ClassNotFoundException exception) {
			System.out.println(exception);
		} catch (SQLException exception) {
			System.out.println(exception);
		}
	}
	private static void deleteEmployee(int employeeID ) {
		try {
			// Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Get a connection
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			//Create a statement
			Statement statement = connection.createStatement();
			//Execute a Query
			String deleteQuery = "delete from emp where employee_id =" + employeeID;
			//System.out.println(insertQuery);
			int noOfRowsAffected = statement.executeUpdate(deleteQuery);
			//Iterate through the result set and display the records.
			System.out.println(noOfRowsAffected + " row(s) deleted!");
			
		} catch (ClassNotFoundException exception) {
			System.out.println(exception);
		} catch (SQLException exception) {
			System.out.println(exception);
		}
}
}
