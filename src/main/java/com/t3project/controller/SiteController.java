package com.t3project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.t3project.bean.Vendor;
import com.t3project.service.VendorService;

import java.util.List;

@Controller
public class SiteController {
	
		@Autowired
		VendorService vendorService;
		
		
		@RequestMapping("/index")
		public ModelAndView myIndex(HttpServletRequest req, HttpServletResponse res) {
			
			return new ModelAndView("index");
		}
		
		@RequestMapping("/clientList")
		public ModelAndView clientList(HttpServletRequest req, HttpServletResponse res) {
			
			return new ModelAndView("clientList");
		}
		
		@RequestMapping("/consultantList")
		public ModelAndView consultants(HttpServletRequest req, HttpServletResponse res) {
			
			return new ModelAndView("consultantList");
		}
		
		@RequestMapping("/vendorList")
		public ModelAndView vendors(HttpServletRequest req, HttpServletResponse res) {
			List<Vendor> listVendor = vendorService.listAllVendor();
			ModelMap map = new ModelMap();
			map.addAttribute("vendorList", listVendor);
			map.addAttribute("message", "yeap");
			return new ModelAndView("vendorList", map);
		}
		
		@RequestMapping("/manageResumes")
		public ModelAndView manageResumes(HttpServletRequest req, HttpServletResponse res) {
			
			return new ModelAndView("manageResumes");
		}
		
		
			
}
