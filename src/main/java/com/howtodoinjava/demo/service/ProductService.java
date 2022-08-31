package com.howtodoinjava.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.howtodoinjava.demo.model.Product;
import com.howtodoinjava.demo.repository.ProductPagination;
import com.howtodoinjava.demo.repository.ProductRepository;

@Service
public class ProductService implements IProductService  {
	
	@Autowired
	ProductRepository gProductDao;	

	@Autowired
	ProductPagination gProductPaginationDao;	
	
	@Override
	public List<Product> getAllProduct(int pPageNo,int pPageSize){
		Pageable paging = new PageRequest(pPageNo, pPageSize);
        Page<Product> pagedResult = gProductPaginationDao.findAll(paging);
        return pagedResult.getContent();
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
