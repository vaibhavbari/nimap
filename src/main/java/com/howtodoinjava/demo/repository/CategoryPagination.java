package com.howtodoinjava.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.howtodoinjava.demo.model.Category;

public interface CategoryPagination extends PagingAndSortingRepository<Category,Long>{
    
}
