package com.jdbc.product;

import java.sql.SQLException;

import java.util.List;

public class productClient {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ProductDao productDao = new ProductDao();
		
		int count = productDao.createProductTable();
		System.out.println("Product table created"+count);
		
		int insertCount1 = productDao.saveProduct(new Product(12,"Bat",10000.0));
		System.out.println("Data inserted Successfully ...  "+insertCount1);
		
		int insertCount2 = productDao.saveProduct(new Product(18,"Ball",1000.0));
		System.out.println("Data inserted Successfully ...  "+insertCount2);
		
		int insertCount3 = productDao.saveProduct(new Product(42,"Bails",567.0));
		System.out.println("Data inserted Successfully ...  "+insertCount3);
		
		int insertCount4 = productDao.saveProduct(new Product(10,"Stumps",100009.0));
		System.out.println("Data inserted Successfully ...  "+insertCount4);
		
		int insertCount5 = productDao.saveProduct(new Product(7,"Helmet",1200.0));
		System.out.println("Data inserted Successfully ...  "+insertCount5);
		
		Product product = productDao.getProductById(7);
		
		System.out.println(product+" ");
		
		List<Product> pro = productDao.getAllProducts();
		pro.forEach(System.out::println);
		
		int updateCount = productDao.updateByPrice(10000, 2000);
		System.out.println(updateCount);
		
		int deleteCount = productDao.deleteById(43);
		System.out.println(deleteCount);
		
		int deleteCount1 = productDao.deleteByPrice(123432);
		System.out.println(deleteCount1);
		
		int dropCount = productDao.dropProductTable();
		System.out.println("Product table dropped "+dropCount);
	}

}
