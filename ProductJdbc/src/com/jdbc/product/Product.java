package com.jdbc.product;

public class Product {
	private int proId;
	private String proName;
	private Double proPrice;
	public Product(int proId, String proName, Double proPrice) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proPrice = proPrice;
		
	}
	public Product() {
		super();
		
	}
	
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", proPrice=" + proPrice + "]";
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public Double getProPrice() {
		return proPrice;
	}
	public void setProPrice(Double proPrice) {
		this.proPrice = proPrice;
	}
	
	

}
