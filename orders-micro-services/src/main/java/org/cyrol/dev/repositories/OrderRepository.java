package org.cyrol.dev.repositories;

import org.cyrol.dev.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
