package com.hand.service;

import java.util.List;

import com.hand.model.Film;

public interface FilmService {
	public void create(int film_id,String title, String description ,int language_id);
	public List<Film> listFilms();
	public void delete(Integer film_id);
	public void update(Integer film_id,String title);
}
