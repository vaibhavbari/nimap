package com.howtodoinjava.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.howtodoinjava.demo.model.Product;

public interface ProductPagination extends PagingAndSortingRepository<Product,Long>{
    
}
