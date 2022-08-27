package com.howtodoinjava.demo.service;

import java.util.List;

import com.howtodoinjava.demo.model.Category;

public interface ICategoryService {
	public List<Category> getAllCategories();
	void addCategory(Category pCategory);
}
