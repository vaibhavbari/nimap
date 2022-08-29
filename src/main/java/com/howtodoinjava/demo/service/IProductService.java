package com.howtodoinjava.demo.service;

import java.util.List;


import com.howtodoinjava.demo.model.Product;

public interface IProductService {
	public List<Product> getAllProduct();
	void addProduct(Product pProduct);
	void deleteProduct(int id);
	void updateProduct(Product pProduct);
	Product getProduct(int pId);
}
