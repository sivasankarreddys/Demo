package com.ssr.loginservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ssr.loginservice.model.LoginModel;

public interface LoginRepository extends JpaRepository<LoginModel, Long>{
	
	
	 @Query("select u from LoginModel u where u.username = ?1")
	 List<LoginModel> findByUsername(String username);

	
}
