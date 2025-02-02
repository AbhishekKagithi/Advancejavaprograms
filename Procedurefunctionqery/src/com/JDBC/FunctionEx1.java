package com.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class FunctionEx1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Abhi","Rnadal");
		
		CallableStatement callableStatement = connection.prepareCall("{? = call getAvg(?,?)}");
		
		
		callableStatement.setInt(3, 1002);
		callableStatement.setInt(2, 1001);
		
		callableStatement.registerOutParameter(1,Types.DOUBLE );
		callableStatement.executeUpdate();
		
		System.out.println(callableStatement.getDouble(1));
		
		connection.close();
	}

}
