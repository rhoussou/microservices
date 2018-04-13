package org.cyrol.dev.services;

import java.util.Optional;

import org.cyrol.dev.models.Category;
import org.cyrol.dev.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryServiceInterface {
	
	@Autowired
    private CategoryRepository categoryRepository;

	@Override
	public boolean isCategoryExist(Category category) {
		Optional<Category> exist = categoryRepository.findById(category.getId());
		if (exist.isPresent()) {
			return true;
		}
		return false;
	}
	

}
