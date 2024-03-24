package com.pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcex1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//step 1:
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("JDBC driver loaded...");
		
		
		//step 2:
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Abhi","Rnadal");
		System.out.println("Connection created ...");
		
		//step 3:
		
		Statement statement = connection.createStatement();
		String q1= "Create table Emp(Empid number,Empname varchar2(28),EmpSalary number)";
		int res1 = statement.executeUpdate(q1);
		System.out.println("Table created...."+res1);
		

		
		/*String q2= "drop table Emp";
		int res2 = statement.executeUpdate(q2);
		System.out.println("Table dropped...."+res2);*/
		
		//step 4:
		
		connection.close();
		
		System.out.println("Connection closed");

	}

	

}
