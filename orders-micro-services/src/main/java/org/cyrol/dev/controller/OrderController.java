package org.cyrol.dev.controller;


import javax.validation.Valid;

import org.cyrol.dev.models.Order;
import org.cyrol.dev.repositories.ItemRepository;
import org.cyrol.dev.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/order")
public class OrderController {
	
	
	@Autowired
    private OrderRepository orderRepository;
	
	@Autowired
    private ItemRepository itemRepository;
	
	
	@PostMapping
    public void insert(@Valid @RequestBody Order order)  {
		orderRepository.save(order);
		order.getItems().forEach(item -> {
			item.setOrder(order);
			itemRepository.save(item);
			
			});
	
	}
   
}
