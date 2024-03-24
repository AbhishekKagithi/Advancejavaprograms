package com.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class ProcedureEx {
	public static void main(String args[])throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Abhi","Rnadal");
		
		//call the procedure
		CallableStatement callableStatement = connection.prepareCall("{call getSalary(?,?)}");
		
		//set the input data
		
		callableStatement.setInt(1,1001);
		
		//Register one variable to store the output.
		
		callableStatement.registerOutParameter(2,Types.FLOAT);
		
		//execute the query
		
		callableStatement.executeUpdate();
		
		//print the output
		
		System.out.println(callableStatement.getFloat(2));
		
		connection.close();
	}
}
