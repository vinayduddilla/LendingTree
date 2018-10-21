package com.lt.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lt.app.model.BankDAO;
import com.lt.app.service.BankService;
import com.lt.app.service.BankServiceImpl;



@RequestMapping("/lending")
public class ltController {
	
	@RequestMapping(value="/ltRegistration", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView getRegistrationPage() {
		System.out.println("Initialized");
		return new ModelAndView("views/ltRegister");
	}
	@RequestMapping(value="/viewLoan")
	public ModelAndView viewLoanRequest(HttpServletRequest request,HttpServletResponse response) {
		return null;
	}
	@RequestMapping(value="/processRegistration", method= {RequestMethod.POST})
	public ModelAndView registrationProcess(HttpServletRequest request, HttpServletResponse response) {
		
		BankDAO bankData = new BankDAO();
		String bankName = ((String)request.getAttribute("bankName")).trim();
		Long bankID = Long.parseLong(((String)request.getAttribute("bankIDname")).trim());
		String bankBranch = ((String)request.getAttribute("bankBranch")).trim();
		
		bankData.setBankName(bankName);
		bankData.setBankID(bankID);
		bankData.setBranch(bankBranch);
		
		BankService bankService = new BankServiceImpl();
		bankService.createAdmin(bankData);
		
		return null;
	}

}
