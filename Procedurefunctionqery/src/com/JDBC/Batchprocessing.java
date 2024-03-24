package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class Batchprocessing {
	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abhi","Rnadal");
		
		Statement statement = connection.createStatement();
		
		statement.addBatch("create table student(id number,name varchar(30))");
		statement.addBatch("insert into student values(12,'Seth')");
		statement.addBatch("insert into student values(543,'Dean')");
		statement.addBatch("Delete from student where id in(12,543)");
		statement.addBatch("drop table student");
		
		int[] w = statement.executeBatch();		
		
		for(int ele:w)
			System.out.println(ele);
		connection.close();
	}

}
