/**
 * 
 */
package org.cyrol.dev.customer.repository;

import java.util.Optional;

import org.cyrol.dev.customer.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author roland
 *
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	Optional<Customer> findByEmail(String email);
	
	Optional<Customer> findByUsername(String username);

}
