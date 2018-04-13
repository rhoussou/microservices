package org.cyrol.dev.controller;

import javax.validation.Valid;
import org.cyrol.dev.models.Category;
import org.cyrol.dev.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/category")
public class CategoryController {
	
	
	@Autowired
    private CategoryRepository categoryRepository;
	
	
	@PostMapping
    public void insert(@Valid @RequestBody Category category)  {
		categoryRepository.save(category);
		
	}
   
}
