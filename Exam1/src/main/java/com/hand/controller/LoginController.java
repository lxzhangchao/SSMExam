package com.hand.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hand.model.User;
import com.hand.service.impl.UserServiceImpl;


@Controller
public class LoginController {

private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	/**
	 * login
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String loginHome(@ModelAttribute("user") User user) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("servlet-context.xml");
		UserServiceImpl ud=(UserServiceImpl)context.getBean("userService");
		if(ud.getUser(user.getUserName(),user.getPassWord())==null){
			return "redirect:/index.html";
			//return "home";
		}else{
			logger.info(user.getUserName()+" Welcome home!");		
			logger.info(user.getPassWord()+" Welcome home!");	
			return "redirect:views/film.jsp";
			//return "home";
		}
	}
}
