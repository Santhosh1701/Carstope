package com.example.Form.service.impl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Form.DAO.FormDAO;
import com.example.Form.entity.FormEntity;
import com.example.Form.repoistry.FormRepoistry;
import com.example.Form.service.FormService;

@Service
public class FormServiceImpl implements FormService {

	
	 private static HashMap<String, String> hm = new HashMap<>();
	
	
	@Autowired
	FormRepoistry formRepoistry;
	
	@Override
	public String view() {
		
		return "view";
	}

	@Override
	public String register(FormDAO formdao) {
		
		FormEntity user = new FormEntity();
		
		user.setEmail(formdao.getEmail());
		user.setPassword(formdao.getPassword());
		user.setConfirm_password(formdao.getConfirm_password());
		
		if(user.getPassword().equals(user.getConfirm_password())) {
			
			formRepoistry.save(user);
			return "Registered Successfully";
		}
		
		else {
			
			return "Error, Please check the password";
		}	
	}
	
	@Override
	public String login(FormDAO formdao) {
		
		FormEntity user = new FormEntity();
		
		user.setEmail(formdao.getEmail());
		user.setPassword(formdao.getPassword());
		
		return null;
		
	}

	@Override
	public String forgot(FormDAO formdao) {
		
		FormEntity user = new FormEntity();
		
		user.setEmail(formdao.getEmail());
			
		return null;
	}
	
	
	@Override
	public String forgotPass(String email) {
		
		
		return null;
	}
			
		/*
		FormDAO formdao= new FormDAO();
		FormEntity user = new FormEntity();
		if(hm.containsKey(email)) {
		
		user.setPassword(formdao.getPassword());
		user.setConfirm_password(formdao.getConfirm_password());
		
		if(user.getPassword().equals(user.getConfirm_password())) {
				
				formRepoistry.save(user);
			//	registered(user.getEmail(),user.getPassword());
		
				return null;
			}
		}
		return null;
	}
*/
	
}