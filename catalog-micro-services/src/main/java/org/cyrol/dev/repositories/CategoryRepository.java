package org.cyrol.dev.repositories;


import org.cyrol.dev.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
