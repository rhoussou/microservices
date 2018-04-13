package org.cyrol.dev.repositories;


import org.cyrol.dev.models.Variant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VariantRepository extends JpaRepository<Variant, Long> {

}
