package org.cyrol.dev.security.service;

import java.util.Optional;

import org.cyrol.dev.customer.models.Customer;
import org.cyrol.dev.customer.repository.CustomerRepository;
import org.cyrol.dev.security.domain.JwtUserFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by Roland Houssou.
 */
@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	
    	
    	Optional<Customer> customer = customerRepository.findByUsername(username);

        if (!customer.isPresent()) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else {
            return JwtUserFactory.create(customer.get());
        }
    }
}
