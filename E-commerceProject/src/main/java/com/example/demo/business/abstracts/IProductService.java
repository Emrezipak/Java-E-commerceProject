package com.example.demo.business.abstracts;

import java.util.List;

import com.example.demo.Entities.concrete.Product;

public interface IProductService {
	
	List<Product> getAll();
    void Add(Product product);
    void delete(Product product);
    void Update(Product product);

}
