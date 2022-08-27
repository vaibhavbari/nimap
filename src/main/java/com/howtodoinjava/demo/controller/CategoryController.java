package com.howtodoinjava.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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

//	@RequestMapping("/deleteCategory/{id}")
//    public void deleteCategory() 
//    {
//		List<Employee> employeesList = new ArrayList<Employee>();
//		employeesList.add(new Employee(2,"Bhupesh","bari","bhupeshbari@gmail.com"));
//		return employeesList;
//    }
//	
//	@RequestMapping("/updateCategory/{id}")
//    public void updateCategory() 
//    {
//		List<Employee> employeesList = new ArrayList<Employee>();
//		employeesList.add(new Employee(2,"Bhupesh","bari","bhupeshbari@gmail.com"));
//		return employeesList;
//    }
//
//	@RequestMapping("/category/{id}")
//    public Category getCategoryById() 
//    {
//		List<Employee> employeesList = new ArrayList<Employee>();
//		employeesList.add(new Employee(2,"Bhupesh","bari","bhupeshbari@gmail.com"));
//		return employeesList;
//    }

}
