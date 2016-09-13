package com.hand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hand.model.Film;

@Controller
@RequestMapping(value="film")
public class FilmController {
	@RequestMapping(value="/show.done",method=RequestMethod.GET)
	public String showAllFilm(){
		return "redirect:views/main.jsp";
	}
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String  doSave(@ModelAttribute Film film){			
		//在此进行业务操作，比如数据库持久化
		film.setFilm_id(123);
		return "redirect:views/main.jsp";
	}
}
