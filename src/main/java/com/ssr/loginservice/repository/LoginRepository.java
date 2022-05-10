package com.ssr.loginservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssr.loginservice.model.LoginModel;

public interface LoginRepository extends JpaRepository<LoginModel, Long>{

	
}
