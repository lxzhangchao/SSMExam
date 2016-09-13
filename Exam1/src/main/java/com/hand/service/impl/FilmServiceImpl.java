package com.hand.service.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.hand.mapper.FilmMapper;
import com.hand.model.Film;
import com.hand.service.FilmService;

public class FilmServiceImpl implements FilmService{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject; 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	public void create(int film_id,String title, String description ,int language_id) {
		String SQL = "insert into Film (film_id,title, description ,language_id) values (?,?,?,?)";     
		jdbcTemplateObject.update( SQL, title, description ,language_id);
		return;
	}
	public List<Film> listFilms(){
		String SQL = "select * from film";
		List <Film> films = jdbcTemplateObject.query(SQL, 
				new FilmMapper());
		return films;
	}
	public void delete(Integer film_id){
		String SQL = "delete from film where film_id = ?";
		jdbcTemplateObject.update(SQL, film_id);
		return;
	}
	public void update(Integer film_id,String title){
		String SQL = "update Student set title = ? where film_id = ?";
		jdbcTemplateObject.update(SQL,film_id,title);
		return;
	}
}
