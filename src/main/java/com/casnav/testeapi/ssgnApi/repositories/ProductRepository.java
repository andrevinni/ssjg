package com.casnav.testeapi.ssgnApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casnav.testeapi.ssgnApi.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
