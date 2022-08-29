package com.howtodoinjava.demo.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.howtodoinjava.demo.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
	
}
