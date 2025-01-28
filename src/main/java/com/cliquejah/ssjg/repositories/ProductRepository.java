package com.cliquejah.ssjg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cliquejah.ssjg.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
