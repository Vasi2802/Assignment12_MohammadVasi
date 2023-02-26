package org.antwalk.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.antwalk.dao.ValentineDao;
import org.antwalk.model.Valentine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@Autowired
	ValentineDao vdao;

	@RequestMapping("home")
	public ModelAndView askValentine(HttpServletRequest request) {
		ModelAndView mv=new ModelAndView("home");
		Valentine valentine=new Valentine();
		Map<String,String> gifts=new HashMap<String,String>();
		gifts.put("Teddy", "Teddy");
		gifts.put("Chocolate", "Chocolate");
		gifts.put("Rose", "Rose");
		mv.addObject("gifts",gifts);
		mv.addObject("valentine",valentine);
		return mv;
	}
	
	@RequestMapping("show")
	public ModelAndView showValentine(@ModelAttribute Valentine valentine) {
		vdao.create(valentine.getDay(), valentine.getGift(), valentine.getLocation());
		ModelAndView mv=new ModelAndView("show");
		mv.addObject("valentine",valentine);
		return mv;
	}
	
	
	@RequestMapping("/")
	public String hello() {
		return "hello";
	}
}
