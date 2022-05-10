package com.ssr.loginservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssr.loginservice.model.Accounts;

public interface AccountRepository extends JpaRepository<Accounts, Long>{
	
	@Override
    List<Accounts> findAll();
}
