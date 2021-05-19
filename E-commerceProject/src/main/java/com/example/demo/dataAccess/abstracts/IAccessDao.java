package com.example.demo.dataAccess.abstracts;

import java.util.List;

import com.example.demo.Entities.concrete.Product;

public interface IAccessDao {
	
	List<Product> getAll();
	
	void save(Product product);
	
	void delete(Product product);
	
	void update(Product product);
	
	List<Product> getCategoryList(int categoryId);
	
}
