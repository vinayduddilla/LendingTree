package com.lt.app.service;

import org.springframework.web.servlet.ModelAndView;

import com.lt.app.model.BankDAO;
import com.lt.app.util.ltUtil;

public class BankServiceImpl implements BankService {

	public boolean createAdmin(BankDAO bankData) {
		// TODO Get database connections from connections module or use hibernate and
		// write this class which is used to store data into DB
		ltUtil.getConnection("jdbcDriver");
		
		return ltUtil.sqlUpdate(bankData);
	}

	public boolean updateAdmin() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAdmin() {
		// TODO Auto-generated method stub
		return false;
	}

}
