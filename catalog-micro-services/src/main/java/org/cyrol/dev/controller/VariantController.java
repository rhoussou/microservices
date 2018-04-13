package org.cyrol.dev.controller;


import javax.validation.Valid;

import org.cyrol.dev.models.Variant;
import org.cyrol.dev.repositories.VariantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/variant")
public class VariantController {
	
	@Autowired
    private VariantRepository variantRepository;
	
	@PostMapping
    public void insert(@Valid @RequestBody Variant variant )  {
		
		variantRepository.save(variant);	
	}
   
}
