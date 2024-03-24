package com.pack;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	public int save(Employee emp)
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int count = 0;
		try
		{
			connection = Dbconnection.createConnection();
			
			preparedStatement = connection.prepareStatement("insert into Emp values(?,?,?)");
			
			preparedStatement.setInt(1,emp.getEmpId());
			preparedStatement.setString(2,emp.getEmpName());
			preparedStatement.setDouble(3,emp.getEmpSalary());
			
			count = preparedStatement.executeUpdate();
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(preparedStatement != null)
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return count;
	}

	public Employee findById(int EmpId)
	{
		Employee employee = null;
		
		try(Connection connection = Dbconnection.createConnection();
				PreparedStatement preparedStatement = connection.prepareStatement("select * from emp where empId = ?"))
		{
			
			preparedStatement.setInt(1, EmpId);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
			{
				employee = new Employee();
				employee.setEmpId(resultSet.getInt(1));
				employee.setEmpName(resultSet.getString(2));
				employee.setEmpSalary(resultSet.getDouble(3));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return employee;
	}
		
		public int deleteById(int empId)
		{
			int count = 0;
			
			try(Connection connection = Dbconnection.createConnection(); PreparedStatement preparedStatement = connection.prepareStatement("delete from Emp where empId = ?"))
			{
				preparedStatement.setInt(1, empId);
				
				count = preparedStatement.executeUpdate();
		
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
			return count;
		
				
	}
		public int deleteBySalary(double empSalary)
		{
			int count = 0;
			
			try(Connection connection = Dbconnection.createConnection(); PreparedStatement preparedStatement = connection.prepareStatement("delete from Emp where empId = ?"))
			{
				preparedStatement.setDouble(1, empSalary);
				
				count = preparedStatement.executeUpdate();
		
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
			return count;
		
				
	}
		public List<Employee> findAll()
		{
			List<Employee> emps = new ArrayList<Employee>();
			try(Connection connection = Dbconnection.createConnection())
					{
				Statement statement = (Statement) connection.createStatement();
	ResultSet resultSet = statement.executeQuery("Select * from emp");
	while(resultSet.next())
		
	{
		Employee employee = new Employee();
		employee.setEmpId(resultSet.getInt(1));
		employee.setEmpName(resultSet.getString(2));
		employee.setEmpSalary(resultSet.getDouble(3));
		emps.add(employee);
	}
		
}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return emps;
		}
		public int updateSalary(double minSalary,double incrementSalary)
		{
			int count =0;
			try(Connection connection = Dbconnection.createConnection();
				PreparedStatement preparedStatement = connection.prepareStatement("update emp set empSalary = empSalary+? where empSalary > ?"))
		
		{
				preparedStatement.setDouble(1,incrementSalary);
				preparedStatement.setDouble(2,minSalary);
				
				//execute the query
				
				count = preparedStatement.executeUpdate();
				
		}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return count;
		}
	

}
