package com.ssr.loginservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssr.loginservice.model.LoginModel;
import com.ssr.loginservice.repository.LoginRepository;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);	   
    

	@Autowired
	LoginRepository loginReposiory;
	

	LoginModel loginModel = new LoginModel();

	@PostMapping("/registration")
	public String registration(@RequestBody LoginModel loginbean) {
	
		System.out.println("Entery point");
	
		loginReposiory.save(loginbean);

		return "sucess";
	}

	@PostMapping("/login")
	public String loginValidate(@RequestBody LoginModel login) {      
		logger.warn("before validate login use json login object");
		if (login.getUsername() != "" && login.getPassword() != "") {
			List<LoginModel> loginModel = loginReposiory.findByUsername(login.getUsername());
			for (LoginModel result : loginModel)
				if (result.getUsername().contains(login.getUsername())) {
					//logger.log(Level.INFO, login.getUsername());
					return "sucess--" + login.getUsername();
				}
		
			logger.debug("we created new new user.");
			return "we created new new user.";
		}

		return "login failed";
	}
	


}
