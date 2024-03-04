package com.datarest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import com.datarest.entity.User;
@RepositoryRestResource(path = "members")
public interface UserRepo extends JpaRepository<User, Long> {
	
}
