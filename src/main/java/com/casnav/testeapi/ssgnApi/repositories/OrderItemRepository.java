package com.casnav.testeapi.ssgnApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casnav.testeapi.ssgnApi.entities.OrderItem;
import com.casnav.testeapi.ssgnApi.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
