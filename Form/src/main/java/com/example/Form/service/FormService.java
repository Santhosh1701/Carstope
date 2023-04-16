package com.example.Form.service;

import com.example.Form.DAO.FormDAO;

public interface FormService {
	
	public String view();
	public String register(FormDAO formdao);
	public String login(FormDAO formdao);
	public String forgot(FormDAO formdao);
	public String forgotPass(String email);
	
}
