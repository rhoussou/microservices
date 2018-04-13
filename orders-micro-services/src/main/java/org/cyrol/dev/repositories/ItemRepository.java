package org.cyrol.dev.repositories;


import org.cyrol.dev.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
