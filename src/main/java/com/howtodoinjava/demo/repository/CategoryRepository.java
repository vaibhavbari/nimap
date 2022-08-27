package com.howtodoinjava.demo.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.model.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
	
}
