package com.cliquejah.ssjg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cliquejah.ssjg.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
