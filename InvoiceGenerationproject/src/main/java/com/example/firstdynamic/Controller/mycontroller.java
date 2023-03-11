package com.example.firstdynamic.Controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.firstdynamic.Entity.ZohoInvoice;
import com.example.firstdynamic.Entity.details;
import com.example.firstdynamic.Repo.repodetails;
import com.example.firstdynamic.Repo.repodetails1;
import com.example.firstdynamic.payload.logindetails;
import com.example.firstdynamic.service.reportservice;

import jakarta.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;




@Controller
public class mycontroller {

	@Autowired
	repodetails repo;
	@Autowired
	private AuthenticationManager auth;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private repodetails1 repo1;
	@Autowired
	private reportservice service;
	@RequestMapping("/home")
	public String homepage()
	{
		return "home.jsp";
	}
	
	@PostMapping("/postdata")
	@ResponseBody
	public String userdata( details data)
	{
		data.setPassword(passwordEncoder.encode(data.getPassword()));
		repo.save(data);
		return "you have registered succesfully";
	}
	@PostMapping("/welcomedata")
	@ResponseBody
	public String invoicedata( ZohoInvoice data1, HttpServletResponse response) throws IOException
	{
		repo1.save(data1);
		response.sendRedirect("invoice.jsp"); 

		return "Invoice generated succesfully";
	}
	@GetMapping("/showdata")
	public ModelAndView showdata(HttpServletResponse response) throws IOException
	{
		ModelAndView mView = new ModelAndView();
		List<ZohoInvoice> data =repo1.findAll();
		mView.addObject("d",data);
		mView.setViewName("view");
		response.sendRedirect("invoice.jsp");
		return mView;
	}
	
		
	@RequestMapping("/deletedata")
	@ResponseBody
	public String deletedata(@RequestParam("id") int id)
	{
		repo.deleteById(id);
		return "deleted successfully";
	}
	
	@PostMapping("/logindata")
	@ResponseBody
	public String logindata(logindetails log, HttpServletResponse response) throws IOException
	{
		Authentication authentication = 
				auth.authenticate(
					new UsernamePasswordAuthenticationToken(log.getEmail(), log.getPassword())	);
		SecurityContextHolder.getContext().setAuthentication(authentication);
		response.sendRedirect("welcome.jsp"); 
		return "welcome here"; 
	}
	
	
	
	
	@GetMapping("/invoicepdf")
	@ResponseBody
	public String generateReport(String pdf) throws FileNotFoundException, JRException
	{
		return service.exportreport(pdf);
	}
	
	
}
