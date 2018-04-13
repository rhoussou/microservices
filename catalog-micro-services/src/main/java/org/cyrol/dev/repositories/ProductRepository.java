package org.cyrol.dev.repositories;


import org.cyrol.dev.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
