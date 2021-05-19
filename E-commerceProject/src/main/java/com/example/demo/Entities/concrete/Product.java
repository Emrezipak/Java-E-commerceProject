package com.example.demo.Entities.concrete;

import com.example.demo.Entities.abstracts.IEntity;

public class Product implements IEntity{
	
	private int productId;
	private String productName;
	private int categoryId;
	private double unitsPrice;
	private int unitsInStock;
	
	public Product(int productId, String productName, int categoryId, double unitsPrice, int unitsInStock) {
		this.productId = productId;
		this.productName = productName;
		this.categoryId = categoryId;
		this.unitsPrice = unitsPrice;
		this.unitsInStock = unitsInStock;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public double getUnitsPrice() {
		return unitsPrice;
	}
	public void setUnitsPrice(double unitsPrice) {
		this.unitsPrice = unitsPrice;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	
	
	
	

}
