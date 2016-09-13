package com.hand.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.model.Film;
import com.hand.service.impl.FilmServiceImpl;

public class Filmservicet {
	public List<Film> index(){
		List<Film> al=new ArrayList<Film>();
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("servlet-context.xml");
		FilmServiceImpl fs = 
				(FilmServiceImpl)context.getBean("filmService"); 
		al=fs.listFilms();
		//mav.add(al);
		return al;
	}
}
