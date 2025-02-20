package com.casnav.testeapi.ssgnApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casnav.testeapi.ssgnApi.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
