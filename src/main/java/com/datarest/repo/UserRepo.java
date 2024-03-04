package com.datarest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.datarest.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
	
}
