package com.cliquejah.ssjg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cliquejah.ssjg.entities.OrderItem;
import com.cliquejah.ssjg.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
