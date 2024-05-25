package com.springBoot.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.api.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
