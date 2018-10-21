package com.lt.app.service;

import org.springframework.web.servlet.ModelAndView;

import com.lt.app.model.BankDAO;

public interface BankService {
	
	public boolean createAdmin(BankDAO bankData);
	public boolean updateAdmin();
	public boolean deleteAdmin();

	

}
