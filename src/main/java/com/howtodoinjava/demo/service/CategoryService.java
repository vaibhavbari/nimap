package com.howtodoinjava.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.howtodoinjava.demo.model.Category;
import com.howtodoinjava.demo.repository.CategoryRepository;

@Service
public class CategoryService implements ICategoryService  {
	
	@Autowired
	CategoryRepository gCategoryDao;	
	
	@Override
	public List<Category> getAllCategories(){
		List<Category> lCategoryList = new ArrayList<Category>();
		gCategoryDao.findAll().forEach(category -> lCategoryList.add(category));
		return lCategoryList;
	}
	
	@Override
	public void addCategory(Category pCategory){
		gCategoryDao.save(pCategory);
	}
}
