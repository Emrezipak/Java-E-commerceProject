package com.example.demo.business.concrete;

import java.util.List;
import java.util.Scanner;

import com.example.demo.Entities.concrete.Product;
import com.example.demo.business.abstracts.IProductService;
import com.example.demo.dataAccess.abstracts.IAccessDao;

public class ProductManager implements IProductService {
    Scanner scanner=new Scanner(System.in);
	private IAccessDao database;

	public ProductManager(IAccessDao database) {
		this.database = database;
	}

	@Override
	public List<Product> getAll() {
		
		return database.getAll();
	}

	@Override
	public void Add(Product product) {
		
	if(product.getUnitsInStock()<=0 || product.getProductName().equals("")) {
	System.out.println("ürün stok adedi geçerli değil ya da ürün adı girilmemiş...");
	return;
	}
	else if(product.getUnitsPrice()<=0) {
		System.out.println("Ürün için bir fiyat belirleyiniz...");
		return;
	}
	database.save(product);
	}

	@Override
	public void delete(Product product) {
		
		if(product.getUnitsInStock()>0) {
			System.out.println("Bu üründen stokta "+product.getUnitsInStock()+" ürün mevcut");
		    System.out.print("Ürünü silmek istiyor musunuz? (Evet-Hayır) : ");
		    String answer=scanner.nextLine();
		    if(answer.equals("Evet")) {
		    	database.delete(product);
		    }
		    else {
		    	return;
		    }
		}
		else {
			database.delete(product);
		}
	}

	@Override
	public void Update(Product product) {
		
		if(product.getUnitsInStock()<=0) {
			System.out.println("Stok adedi 0 ve altında olamaz...");
			return;
		}
		else if(product.getProductName().equals("")) {
			System.out.println("Lütfen Güncellencek ürünün ismini belirtiniz...");
			return;
		}
		database.update(product);
	}

}
