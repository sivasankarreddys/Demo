package com.ssr.loginservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssr.loginservice.model.LoginModel;
import com.ssr.loginservice.model.Accounts;
@Service
public interface LoginService {

	public String saveProduct(LoginModel lb);
	
	public List<Accounts> fetchAccounts();

}
