package org.cyrol.dev.customer.controller;


import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.cyrol.dev.customer.models.Customer;
import org.cyrol.dev.customer.repository.CustomerRepository;
import org.cyrol.dev.exception.BadRequestException;
import org.cyrol.dev.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
    private CustomerRepository customerRepository;
	
	
    @GetMapping
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @PutMapping("/{id}")
    public void update(@Valid @RequestBody Customer customer, @PathVariable("id") long id) {
    	
    	Optional<Customer> alreadyExist = customerRepository.findById(id);
    	if (!alreadyExist.isPresent()) {
    		throw new ResourceNotFoundException("email already used");
    	}
    	customer.setId(id);
    	customerRepository.save(customer);
    }

    @PostMapping
    public void insert(@Valid @RequestBody Customer customer)  {
    	
    	Optional<Customer> alreadyExist = customerRepository.findByEmail(customer.getEmail());
    	if (alreadyExist.isPresent()) {
    		    throw new BadRequestException("email already used");
        }
    	customerRepository.save(customer);
    }
    
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable("id") long id) throws ResourceNotFoundException{
    	Optional<Customer> customer = customerRepository.findById(id);
    	if (!customer.isPresent()) {
    		throw new ResourceNotFoundException("user not found");
    	}
    	return customer.get();
    }

}
