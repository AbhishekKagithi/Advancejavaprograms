package com.sathya;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
//import java.sql.Statement;
import java.util.List;



public class ProductDAO {

	
	 
	// This method will save the products to Database
	public int saveProduct(Product prod) {
		int count = 0;
		try (Connection connection = DBConnection.createConnection();
				PreparedStatement preparedStatement = connection.prepareStatement("insert into product_details values(?,?,?,?,?,?,?,?,?,?)");) {
			preparedStatement.setString(1, prod.getProId());
			preparedStatement.setString(2, prod.getProName());
			preparedStatement.setDouble(3, prod.getProPrice());
			preparedStatement.setString(4, prod.getProBrand());
			preparedStatement.setString(5, prod.getProMadeIn());
			preparedStatement.setDate(6, prod.getProMfgDate());
			preparedStatement.setDate(7, prod.getProExpDate());
			preparedStatement.setBytes(8, prod.getProImage());
			preparedStatement.setBytes(8, prod.getProAudio());
			preparedStatement.setBytes(8, prod.getProVideo());

			count = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return count;
	}
	
	public List<Product> findAll()
	{
	List<Product> pro = new ArrayList<Product>();
	
		 try (Connection connection = DBConnection.createConnection();)
		 { 
			 Statement statement = connection.createStatement();
			 
			 ResultSet resultSet = statement.executeQuery("Select * from Product_details");
			 
			 while(resultSet.next())
				{
					Product product = new Product();
					product.setProId(resultSet.getString(1));
					product.setProName(resultSet.getString(2));
					product.setProPrice(resultSet.getDouble(3));
					product.setProBrand(resultSet.getString(4));
					product.setProMadeIn(resultSet.getString(5));
					product.setProMfgDate(resultSet.getDate(6));
					product.setProExpDate(resultSet.getDate(7));
					
					product.setProImage(resultSet.getBytes(8));
					product.setProImage(resultSet.getBytes(9));
					product.setProImage(resultSet.getBytes(10));
					
					pro.add(product);
				}
				
				
				
			}
		 catch (SQLException e) {
				e.printStackTrace();
			}

		 return pro;
			 
		 }
	public int DeleteById(String proId)
	{
		int count=0;
		try(Connection connection = DBConnection.createConnection();
				PreparedStatement preparedStatement = connection.prepareStatement("delete from product_details where proId = ?"))
		{
			preparedStatement.setString(1, proId);
			
			count = preparedStatement.executeUpdate();
			
		}
		catch(SQLException e)
		{e.printStackTrace();
		}
		return count;
		}
	public Product findById(String proId)
	{
		Product product = null;
		
		try(Connection connection = DBConnection.createConnection();
				PreparedStatement preparedStatement = connection.prepareStatement("select * from Product_details where proId = ?");)
		{
			preparedStatement.setString(1, proId);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
			{
				product = new Product();
				
				product.setProId(resultSet.getString(1));
				product.setProName(resultSet.getString(2));
				product.setProPrice(resultSet.getDouble(3));
				product.setProBrand(resultSet.getString(4));
				product.setProMadeIn(resultSet.getString(5));
				product.setProMfgDate(resultSet.getDate(6));
				product.setProExpDate(resultSet.getDate(7));
				
				product.setProImage(resultSet.getBytes(8));
				product.setProImage(resultSet.getBytes(9));
				product.setProImage(resultSet.getBytes(10));
				
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		
		return product;
	}
	public int update(Product prod)
	{
		int count =0;
		try(Connection connection = DBConnection.createConnection();
				PreparedStatement preparedStatement = connection.prepareStatement("update product_details set proName = ?,ProPrice=?,ProBrand=?,ProMadeIn=?,ProMfgDate=?,ProExpDate=?,proImage = ?,proAudio = ?,proVideo = ? where proId = ?"))
		{
			
			preparedStatement.setString(1, prod.getProName());
			preparedStatement.setDouble(2, prod.getProPrice());
			preparedStatement.setString(3, prod.getProBrand());
			preparedStatement.setString(4, prod.getProMadeIn());
			preparedStatement.setDate(5, prod.getProMfgDate());
			preparedStatement.setDate(6, prod.getProExpDate());
			preparedStatement.setBytes(7, prod.getProImage());
			preparedStatement.setString(10, prod.getProId());
			preparedStatement.setBytes(8, prod.getProAudio());
			preparedStatement.setBytes(9, prod.getProVideo());
			
			count = preparedStatement.executeUpdate();
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return count;
	}
	}
				 
	
	

