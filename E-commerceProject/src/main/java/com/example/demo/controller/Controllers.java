package com.example.demo.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.Entities.concrete.Product;
import com.example.demo.business.abstracts.IProductService;

public class Controllers {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext configApp=new ClassPathXmlApplicationContext("application.xml");
		
		
		IProductService productManager=configApp.getBean("productManager",IProductService.class);
		
		productManager.Add(new Product(4,"Gömlek",9,55,7));
		//productManager.delete(new Product(4,"Gömlek",8,55,6));
		productManager.Update(new Product(4,"Slim-Gömlek",8,50,1));
		for(Product p1 : productManager.getAll()) {
			System.out.println(p1.getProductName());
		}
		System.out.println("*************************");
		configApp.close();

	}

}
