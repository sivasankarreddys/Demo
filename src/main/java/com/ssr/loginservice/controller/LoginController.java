package com.ssr.loginservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssr.loginservice.LoginService;
import com.ssr.loginservice.model.Accounts;
import com.ssr.loginservice.model.LoginModel;
import com.ssr.loginservice.repository.LoginRepository;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class LoginController {

	@Autowired
	LoginRepository loginReposiory;

	LoginModel loginModel = new LoginModel();
	Accounts accounts = new Accounts();
	@Autowired
	private LoginService loginservice;

	@PostMapping("/registration")
	public ResponseEntity<LoginModel> registration(@RequestBody LoginModel loginbean) {

		if (loginbean.getPassword().length() > 3) {

			loginservice.saveProduct(loginbean);
			return new ResponseEntity<LoginModel>(loginbean,HttpStatus.CREATED);
		}

		return new ResponseEntity<LoginModel>(loginbean, HttpStatus.LENGTH_REQUIRED);
	}

	@GetMapping("/accounts")
	public ResponseEntity<List<Accounts>> fetchAccounts() {
		
		List<Accounts> accounts = loginservice.fetchAccounts();
		if(accounts.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
      
		return new ResponseEntity<>(accounts,HttpStatus.OK);
	}

}
