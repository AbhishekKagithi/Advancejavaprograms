package com.jdbc.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
	
	public int createProductTable()throws ClassNotFoundException, SQLException
	{
		Connection connection = Dbconnection.createConnection();
		Statement statement = connection.createStatement();
		
		int count = statement.executeUpdate("create table Product(proId number,proName varchar(30),proPrice number)");
		
		connection.close();
		return count;
		
		
	}
	
	public int saveProduct(Product product)throws ClassNotFoundException, SQLException
	{
		Connection connection = Dbconnection.createConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("insert into product values(?,?,?)");
		
		preparedStatement.setInt(1,product.getProId());
		preparedStatement.setString(2,product.getProName());
		preparedStatement.setDouble(3,product.getProPrice());
		
		int count = preparedStatement.executeUpdate();
		
		connection.close();
		preparedStatement.close();;
		
		return count;
	}
	public Product getProductById(int proId)throws ClassNotFoundException, SQLException
	{
		Product product = null;
		Connection connection = Dbconnection.createConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("select * from Product where proId = ?");
		
		preparedStatement.setInt(1,proId);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next())
		{
			 product = new Product();
			 product.setProId(resultSet.getInt(1));
			 product.setProName(resultSet.getString(2));
			 product.setProPrice(resultSet.getDouble(3));
			
		}
		connection.close();
		preparedStatement.close();
		
		return  product;
	}
	public List<Product> getAllProducts()throws ClassNotFoundException, SQLException
	{
		List<Product> pro = new ArrayList<Product>(); 
		Connection connection = Dbconnection.createConnection();
		Statement statement = connection.createStatement();
		
		ResultSet resultset = statement.executeQuery("select * from product");
		
		while(resultset.next())
		{
			Product product = new Product();
			product.setProId(resultset.getInt(1));
			product.setProName(resultset.getString(2));
			product.setProPrice(resultset.getDouble(3));
			
			pro.add(product);
		}
		connection.close();
		
		return pro;
	}
	public int updateByPrice(int pricerange,int updatevalue) throws SQLException
	{
		Connection connection = Dbconnection.createConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("update product set proPrice = proPrice + ? where proPrice> ?");
		
		preparedStatement.setDouble(1, updatevalue);
		preparedStatement.setDouble(2, pricerange);
		
		int count = preparedStatement.executeUpdate();
		
		connection.close();
		preparedStatement.close();
		
		return count;
	}
	public int deleteById(int proId) throws SQLException
	{
		Connection connection = Dbconnection.createConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("delete from product where proId= ?");
		
		preparedStatement.setInt(1, proId);
		
		
		int count = preparedStatement.executeUpdate();
		
		connection.close();
		preparedStatement.close();
		
		return count;
	}
	public int deleteByPrice(int proPrice) throws SQLException
	{
		Connection connection = Dbconnection.createConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("delete from product where proPrice= ?");
		
		preparedStatement.setDouble(1, proPrice);
		
		
		int count = preparedStatement.executeUpdate();
		
		connection.close();
		preparedStatement.close();
		
		return count;
	} 
	public int dropProductTable()throws ClassNotFoundException, SQLException
	{
		Connection connection = Dbconnection.createConnection();
		Statement statement = connection.createStatement();
		
		int count = statement.executeUpdate("drop table Product");
		
		connection.close();
		return count;
		
		
	}
	

}
