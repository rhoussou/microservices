package org.cyrol.dev.controller;


import java.util.Optional;

import javax.validation.Valid;
import org.cyrol.dev.exception.ResourceNotFoundException;
import org.cyrol.dev.models.Category;
import org.cyrol.dev.models.SubCategory;
import org.cyrol.dev.repositories.CategoryRepository;
import org.cyrol.dev.repositories.SubCategoryRepository;
import org.cyrol.dev.services.CategoryServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/subcategory")
public class SubCategoryController {
	
	@Autowired
    private SubCategoryRepository subcategoryRepository;
	
	@Autowired
    private CategoryServiceInterface categoryServiceInterface;
	
	@PostMapping
    public void insert(@Valid @RequestBody SubCategory subCategory )  {
		
		/*
		Optional<Category> exist = categoryRepository.findById(subCategory.getCategory().getId());
		if (!exist.isPresent()) {
			 throw new ResourceNotFoundException("category not found !");
        }
		subcategoryRepository.save(subCategory);
		*/
	}
   
}
