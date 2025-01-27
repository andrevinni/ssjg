package com.cliquejah.ssjg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cliquejah.ssjg.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
