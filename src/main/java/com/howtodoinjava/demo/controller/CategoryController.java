package com.howtodoinjava.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.howtodoinjava.demo.model.Category;
import com.howtodoinjava.demo.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	CategoryService gCategoryService;

	@RequestMapping("/categories")
	public List<Category> getCategories() {
		return gCategoryService.getAllCategories();
	}

	@PostMapping("/addcategory")
    public int addCategory(@RequestBody Category pCategory) 
    {
		gCategoryService.addCategory(pCategory);
		return pCategory.getCategoryid();
    }

	@RequestMapping("/deleteCategory/{id}")
    public String deleteCategory(@PathVariable("id") int pCategoryId) 
    {
		gCategoryService.deleteCategory(pCategoryId);
		return "Success";
    }
	
	@RequestMapping("/updateCategory")
    public String updateCategory(@RequestBody Category pCategory) 
    {
		gCategoryService.updateCatory(pCategory);
		return "Success";
    }

	@RequestMapping("/category/{id}")
    public Category getCategoryById(@PathVariable("id") int pCategoryId) 
    {
		return gCategoryService.getCategory(pCategoryId);
    }

}
