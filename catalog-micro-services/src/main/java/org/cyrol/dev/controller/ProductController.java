package org.cyrol.dev.controller;


import javax.validation.Valid;
import org.cyrol.dev.models.Product;
import org.cyrol.dev.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/productr")
public class ProductController {
	
	
	@Autowired
    private ProductRepository productRepository;
	
	@PostMapping
    public void insert(@Valid @RequestBody Product product)  {
		productRepository.save(product);
	
	}
   
}
