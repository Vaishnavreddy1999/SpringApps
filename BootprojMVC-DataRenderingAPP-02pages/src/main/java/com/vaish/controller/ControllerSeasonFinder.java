package com.vaish.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vaish.service.ISeasonFinder;

@Controller
public class ControllerSeasonFinder {
	@Autowired
	private ISeasonFinder service;
	
	
	@RequestMapping("/")
	public String showHomePage() {
		return "welcome";
	}
	
	@RequestMapping("/season")
	public String seasonFinder(Map<String,Object> map) {
		String season=service.findSeason();
			map.put("app1", season);
			
		return "find";
		
		
	}
	

}
