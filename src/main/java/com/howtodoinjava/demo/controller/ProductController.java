package com.howtodoinjava.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.howtodoinjava.demo.model.Product;
import com.howtodoinjava.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService gProductService;

	@RequestMapping("/product")
	public List<Product> getProduct() {
		return gProductService.getAllProduct();
	}

	@PostMapping("/addproduct")
    public int addProduct(@RequestBody Product pProduct) 
    {
		gProductService.addProduct(pProduct);
		return pProduct.getProductid();
    }

	@RequestMapping("/deleteproduct/{id}")
    public String deleteProduct(@PathVariable("id") int pProductId) 
    {
		gProductService.deleteProduct(pProductId);
		return "Success";
    }
	
	@RequestMapping("/updateproduct")
    public String updateProduct(@RequestBody Product pProduct) 
    {
		gProductService.updateProduct(pProduct);
		return "Success";
    }

	@RequestMapping("/product/{id}")
    public Product getProductById(@PathVariable("id") int pProductId) 
    {
		return gProductService.getProduct(pProductId);
    }

}
