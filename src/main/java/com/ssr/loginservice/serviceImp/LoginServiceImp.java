package com.ssr.loginservice.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssr.loginservice.LoginService;
import com.ssr.loginservice.model.Accounts;
import com.ssr.loginservice.model.LoginModel;
import com.ssr.loginservice.repository.AccountRepository;
import com.ssr.loginservice.repository.LoginRepository;
@Service
public class LoginServiceImp implements LoginService {

	@Autowired
	LoginRepository loginrepository;
	
	@Autowired
	AccountRepository accountRepository;
	
	@Override
	public String saveProduct(LoginModel lb) {		
		return loginrepository.save(lb).getUsername();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Accounts> fetchAccounts() {		
		return accountRepository.findAll();
	}

	

}
