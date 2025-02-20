package com.casnav.testeapi.ssgnApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casnav.testeapi.ssgnApi.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
