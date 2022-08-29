package com.howtodoinjava.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.howtodoinjava.demo.model.Product;
import com.howtodoinjava.demo.repository.ProductRepository;

@Service
public class ProductService implements IProductService  {
	
	@Autowired
	ProductRepository gProductDao;	
	
	@Override
	public List<Product> getAllProduct(){
		List<Product> lProductList = new ArrayList<Product>();
		gProductDao.findAll().forEach(product -> lProductList.add(product));
		return lProductList;
	}
	
	@Override
	public void addProduct(Product pProduct){
		gProductDao.save(pProduct);
	}
	
	@Override
	public void deleteProduct(int pId){
		gProductDao.delete(pId);
	}
	
	
	@Override
	public void updateProduct(Product pProduct){
		gProductDao.save(pProduct);
	}
	
	
	@Override
	public Product getProduct(int pId){
		return gProductDao.findOne(pId);
	}
}
