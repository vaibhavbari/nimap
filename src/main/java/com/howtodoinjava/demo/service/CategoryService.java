package com.howtodoinjava.demo.service;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.howtodoinjava.demo.model.Category;
import com.howtodoinjava.demo.repository.CategoryPagination;
import com.howtodoinjava.demo.repository.CategoryRepository;

@Service
public class CategoryService implements ICategoryService  {
	
	@Autowired
	CategoryRepository gCategoryDao;
	
	@Autowired
	CategoryPagination gCategoryPageDao;
	
	@Override
	public List<Category> getAllCategories(int pPageNo, int pPageSize){
		Pageable paging = new PageRequest(pPageNo, pPageSize);
        Page<Category> pagedResult = gCategoryPageDao.findAll(paging);
        return pagedResult.getContent();
	}
	
	@Override
	public void addCategory(Category pCategory){
		gCategoryDao.save(pCategory);
	}
	
	@Override
	public void deleteCategory(int pId){
		gCategoryDao.delete(pId);
	}
	
	
	@Override
	public void updateCatory(Category pCategory){
		gCategoryDao.save(pCategory);
	}
	
	
	@Override
	public Category getCategory(int pId){
		return gCategoryDao.findOne(pId);
	}
}
