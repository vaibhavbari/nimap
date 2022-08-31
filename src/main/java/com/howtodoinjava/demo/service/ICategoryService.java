package com.howtodoinjava.demo.service;

import java.util.List;

import com.howtodoinjava.demo.model.Category;

public interface ICategoryService {
	public List<Category> getAllCategories(int pPageNo, int pPageSize);
	void addCategory(Category pCategory);
	void deleteCategory(int id);
	void updateCatory(Category pCategory);
	Category getCategory(int pId);
}
