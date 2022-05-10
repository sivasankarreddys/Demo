package com.ssr.loginservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssr.loginservice.model.LoginModel;
import com.ssr.loginservice.repository.LoginRepository;

@RestController
@RequestMapping("/api")
public class LoginController {
    
	@Autowired
	LoginRepository loginReposiory;

	LoginModel loginModel = new LoginModel();
	
   
	@PostMapping("/registration")
	public String registration(@RequestBody LoginModel loginbean) {
	

			System.out.println("Entery point");
			
			loginReposiory.save(loginbean);
		
			return "sucess";
	}
	
	@GetMapping("/login")
	public boolean loginValidate(@RequestBody LoginModel loginbean) {
		
		if(loginbean != null) {
			
		//ArrayList<LoginModel> list  =loginReposiory.findOne(loginbean.getUsername());
		}
		
		return true;
	}
	

}
