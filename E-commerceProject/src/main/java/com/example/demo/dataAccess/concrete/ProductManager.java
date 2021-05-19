package com.example.demo.dataAccess.concrete;

import java.util.*;

import com.example.demo.Entities.concrete.Product;
import com.example.demo.dataAccess.abstracts.IAccessDao;

public class ProductManager implements IAccessDao{

	private List<Product> listProduct; 
	
	public ProductManager() {
		this.listProduct=new ArrayList<Product>();
		listProduct.add(new Product(1,"Telefon",5,2500.0,15));
		listProduct.add(new Product(2,"Mobilya",7,1200,2));
		listProduct.add(new Product(3,"Kitap",14,18,20));
	}
	@Override
	public List<Product> getAll() {
		return listProduct;
	}

	@Override
	public void save(Product product) {
		listProduct.add(product);
	}

	@Override
	public void delete(Product product) {	
		
		Product productDelete=null;
		for(Product p1:listProduct) {
		
			if(product.getProductId()==p1.getProductId()) {
				productDelete=p1;
				break;
			}
		}
		listProduct.remove(productDelete);

	}

	@Override
	public void update(Product product) {
		Product productUpdate=null;
		for(Product p1: listProduct) {
			if(product.getProductId()==p1.getProductId()) {
				productUpdate=p1;
				break;
			}
		}
		productUpdate.setProductName(product.getProductName());
		productUpdate.setCategoryId(product.getCategoryId());
		productUpdate.setUnitsPrice(product.getUnitsPrice());
		productUpdate.setUnitsInStock(product.getUnitsInStock());
		productUpdate.setProductId(product.getProductId());
	}
	
	@Override
	public List<Product> getCategoryList(int categoryId) {
        List<Product> getProduct = new ArrayList<Product>();
		for(Product p1:listProduct) {
			
			if(p1.getCategoryId()==categoryId) {
				getProduct.add(p1);
			}
		}
		return getProduct;
	}

}
