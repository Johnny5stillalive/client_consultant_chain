package com.t3project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



import java.util.List;

@Controller
public class SiteController {
	
		//@Autowired
		//EmployeeDAO empDAO;
		
		
		@RequestMapping("/index")
		public ModelAndView myIndex(HttpServletRequest req, HttpServletResponse res) {
			
			return new ModelAndView("index");
		}
		
		@RequestMapping("/clientList")
		public ModelAndView clientList(HttpServletRequest req, HttpServletResponse res) {
			
			return new ModelAndView("clientList");
		}
		
		@RequestMapping("/manageResumes")
		public ModelAndView manageResumes(HttpServletRequest req, HttpServletResponse res) {
			
			return new ModelAndView("manageResumes");
		}
		
		@RequestMapping("/viewVendors")
		public ModelAndView viewVendors(HttpServletRequest req, HttpServletResponse res) {
			
			return new ModelAndView("viewVendors");
		}
		
		
			
		

}
